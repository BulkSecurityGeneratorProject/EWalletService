package com.pichincha.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of WalletSearchRepository to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class WalletSearchRepositoryMockConfiguration {

    @MockBean
    private WalletSearchRepository mockWalletSearchRepository;

}
