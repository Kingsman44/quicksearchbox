package com.google.android.apps.gsa.search.core.p6805i;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.search.C90507o;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.i.c */
/* compiled from: PG */
public final class C86107c implements C86106b {

    /* renamed from: a */
    private final C68214a f232738a;

    /* renamed from: b */
    private final C68214a f232739b;

    /* renamed from: c */
    private final C68214a f232740c;

    public C86107c(C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f232738a = aVar;
        this.f232739b = aVar2;
        this.f232740c = aVar3;
    }

    /* renamed from: b */
    public final String mo6453a() {
        C86338r rVar = (C86338r) this.f232739b.mo27525b();
        String string = rVar.getString(C90507o.f253011a, (String) null);
        if (rVar.getBoolean(C90507o.f253014d, false)) {
            return null;
        }
        return mo79728c(string);
    }

    /* renamed from: c */
    public final String mo79728c(String str) {
        String string;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C86338r rVar = (C86338r) this.f232738a.mo27525b();
        String string2 = rVar.getString("debug_client_instance_id", (String) null);
        if (!TextUtils.isEmpty(string2)) {
            return string2;
        }
        String concat = "client_instance_id_".concat(String.valueOf(str));
        synchronized (this) {
            string = rVar.getString(concat, (String) null);
            if (TextUtils.isEmpty(string)) {
                string = ((C86093a) this.f232740c.mo27525b()).mo79721a(str);
                if (!TextUtils.isEmpty(string)) {
                    C86337q b = rVar.mo80076b();
                    b.mo80073h(concat, string);
                    b.apply();
                }
            }
        }
        return string;
    }
}
