package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import com.google.android.libraries.storage.p3315b.C42834at;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.d */
/* compiled from: PG */
public final /* synthetic */ class C123627d implements C42834at {

    /* renamed from: a */
    public static final /* synthetic */ C123627d f341553a = new C123627d();

    private /* synthetic */ C123627d() {
    }

    /* renamed from: a */
    public final void mo45917a(C42847bf bfVar) {
        bfVar.mo45935i("INSERT INTO ClientProactiveData(data_type, data_id, client_type, display_validity, ve_id, impression_repression, eucd_metadata, impressions_limit, as_target_deep_link_id, rendered_element, like_question_configuration, feature_tree_ref, rendered_card_hash, contextual_triggering_condition, last_update_timestamp, impression_count, click_count, last_impression_timestamp, last_click_timestamp) SELECT data_type, data_id, client_type, display_validity, ve_id, impression_repression, eucd_metadata, impressions_limit, as_target_deep_link_id, rendered_element, like_question_configuration, feature_tree_ref, rendered_card_hash, contextual_triggering_condition, last_update_timestamp, impression_count, click_count, last_impression_timestamp, last_click_timestamp FROM tmp_ClientProactiveData");
    }
}
