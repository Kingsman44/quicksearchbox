package com.google.android.apps.search.googleapp.googleappbrowser.p10269f;

import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.android.libraries.search.udcdataservice.C41408g;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.f.a */
/* compiled from: PG */
public final /* synthetic */ class C135585a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C135585a f369322a = new C135585a();

    private /* synthetic */ C135585a() {
    }

    public final Object apply(Object obj) {
        int a;
        List list = (List) obj;
        ((C59052c) ((C59052c) C135587c.f369324a.mo56224b()).mo56372aa(40673)).mo56389s("SwaaSettingStatusList: %s", list);
        boolean z = false;
        if (list != null && list.size() == 1) {
            C41387c a2 = C41387c.m72380a(((C41389e) list.get(0)).f108146b);
            if (a2 == null) {
                a2 = C41387c.DEFAULT;
            }
            if (a2 == C41387c.WEB_AND_APP_HISTORY && (a = C41408g.m72395a(((C41389e) list.get(0)).f108147c)) != 0 && a == 2) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
