package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import com.google.android.libraries.storage.p3315b.C42827am;
import com.google.android.libraries.storage.p3315b.C42835au;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.i */
/* compiled from: PG */
public final class C123632i implements C68220f {
    /* renamed from: a */
    public static C42835au m203002a() {
        C42827am amVar = new C42827am();
        amVar.mo45916c(11);
        amVar.mo45915b("CREATE TABLE IF NOT EXISTS SharedProactiveData (data_type INTEGER  NOT NULL , data_id TEXT  NOT NULL , data_content BLOB  NOT NULL , hash_tag BLOB  NOT NULL , token BLOB , last_update_timestamp INTEGER  NOT NULL ,  PRIMARY KEY (data_type, data_id))");
        amVar.mo45915b("CREATE TABLE IF NOT EXISTS ClientProactiveData (data_type INTEGER  NOT NULL , data_id TEXT  NOT NULL , client_type TEXT  NOT NULL , display_validity INTEGER  NOT NULL  DEFAULT 0 , ve_id INTEGER ,impression_repression TEXT ,eucd_metadata BLOB ,impressions_limit INTEGER ,feature_tree_ref BLOB ,as_target_deep_link_id TEXT , rendered_element BLOB ,like_question_configuration BLOB ,rendered_card_hash BLOB , contextual_triggering_condition BLOB ,last_update_timestamp INTEGER  NOT NULL , impression_count TEXT  DEFAULT 0 , click_count TEXT  DEFAULT 0 , last_impression_timestamp TEXT  DEFAULT 0 , last_click_timestamp TEXT  DEFAULT 0 ,  PRIMARY KEY (client_type, data_type, data_id))");
        amVar.mo45915b("CREATE TABLE IF NOT EXISTS LastClientDataQuery (data_type INTEGER  NOT NULL , data_id TEXT  NOT NULL , client_type TEXT  NOT NULL , last_query_timestamp INTEGER  NOT NULL , query_time TEXT , data_hash BLOB  NOT NULL ,  PRIMARY KEY (client_type, data_type, data_id))");
        amVar.mo45915b("CREATE TABLE IF NOT EXISTS LastSyncTime (client_type INTEGER  NOT NULL , data_type INTEGER  NOT NULL , last_sync_timestamp INTEGER  NOT NULL ,  UNIQUE (client_type, data_type))");
        amVar.mo45915b("DROP TABLE IF EXISTS LastSyncTime");
        amVar.mo45915b("ALTER TABLE ClientProactiveData RENAME TO tmp_ClientProactiveData");
        amVar.mo45915b("CREATE TABLE IF NOT EXISTS ClientProactiveData (data_type INTEGER  NOT NULL , data_id TEXT  NOT NULL , client_type INTEGER  NOT NULL , display_validity INTEGER  NOT NULL  DEFAULT 0 , ve_id INTEGER ,impression_repression INTEGER ,eucd_metadata BLOB ,impressions_limit INTEGER ,feature_tree_ref BLOB ,as_target_deep_link_id TEXT , rendered_element BLOB ,like_question_configuration BLOB ,rendered_card_hash BLOB , contextual_triggering_condition BLOB ,last_update_timestamp INTEGER  NOT NULL , impression_count INTEGER  DEFAULT 0 , click_count INTEGER  DEFAULT 0 , last_impression_timestamp INTEGER  DEFAULT 0 , last_click_timestamp INTEGER  DEFAULT 0 ,  PRIMARY KEY (client_type, data_type, data_id))");
        amVar.f112108a.mo55395g(C123627d.f341553a);
        amVar.mo45915b("DROP TABLE tmp_ClientProactiveData");
        amVar.mo45915b("ALTER TABLE LastClientDataQuery RENAME TO tmp_LastClientDataQuery");
        amVar.mo45915b("CREATE TABLE IF NOT EXISTS LastClientDataQuery (data_type INTEGER  NOT NULL , data_id TEXT  NOT NULL , client_type INTEGER  NOT NULL , last_query_timestamp INTEGER  NOT NULL , query_time INTEGER , data_hash BLOB  NOT NULL ,  PRIMARY KEY (client_type, data_type, data_id))");
        amVar.f112108a.mo55395g(C123628e.f341554a);
        amVar.mo45915b("DROP TABLE tmp_LastClientDataQuery");
        amVar.mo45915b("ALTER TABLE ClientProactiveData RENAME TO tmp_ClientProactiveData");
        amVar.mo45915b("CREATE TABLE IF NOT EXISTS ClientProactiveData (data_type INTEGER  NOT NULL , data_id TEXT  NOT NULL , client_type INTEGER  NOT NULL , display_validity INTEGER  NOT NULL  DEFAULT 0 , ve_id INTEGER ,impression_repression INTEGER ,eucd_metadata BLOB ,impressions_limit INTEGER ,feature_tree_ref BLOB ,as_target_deep_link_id TEXT , rendered_element BLOB ,like_question_configuration BLOB ,data_content_hash BLOB , contextual_triggering_condition BLOB ,last_update_timestamp INTEGER  NOT NULL , impression_count INTEGER  DEFAULT 0 , click_count INTEGER  DEFAULT 0 , last_impression_timestamp INTEGER  DEFAULT 0 , last_click_timestamp INTEGER  DEFAULT 0 ,  PRIMARY KEY (client_type, data_type, data_id))");
        amVar.f112108a.mo55395g(C123629f.f341555a);
        amVar.mo45915b("DROP TABLE tmp_ClientProactiveData");
        amVar.mo45915b("ALTER TABLE ClientProactiveData RENAME TO tmp_ClientProactiveData");
        amVar.mo45915b("CREATE TABLE IF NOT EXISTS ClientProactiveData (data_type INTEGER  NOT NULL , data_id TEXT  NOT NULL , client_type INTEGER  NOT NULL , display_validity INTEGER  NOT NULL  DEFAULT 0 , ve_id INTEGER ,impression_repression INTEGER ,eucd_metadata BLOB ,impressions_limit INTEGER ,feature_tree_ref BLOB ,as_target_deep_link_id TEXT , rendered_element BLOB ,like_question_configuration BLOB ,data_content_hash BLOB , contextual_triggering_condition BLOB ,last_update_timestamp INTEGER  NOT NULL , impression_count INTEGER  DEFAULT 0 , click_count INTEGER  DEFAULT 0 , last_impression_timestamp INTEGER  DEFAULT 0 , last_click_timestamp INTEGER  DEFAULT 0 , dismissal_expiration_timestamp INTEGER  DEFAULT 0 ,  PRIMARY KEY (client_type, data_type, data_id))");
        amVar.f112108a.mo55395g(C123630g.f341556a);
        amVar.mo45915b("DROP TABLE tmp_ClientProactiveData");
        amVar.mo45915b("ALTER TABLE ClientProactiveData ADD COLUMN filtering_context_conditions BLOB ");
        amVar.mo45915b("ALTER TABLE ClientProactiveData ADD COLUMN input_suggestion BLOB ");
        return amVar.mo45914a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
