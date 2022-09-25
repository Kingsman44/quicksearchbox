package com.google.android.apps.gsa.searchbox.client.gsa.p6951a;

import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaw;
import com.google.android.apps.gsa.search.shared.service.p6935b.aax;
import com.google.android.apps.gsa.shared.p6995aq.C89267j;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.j */
/* compiled from: PG */
public final class C88637j implements C118549h {

    /* renamed from: a */
    private final C88638k f239623a;

    /* renamed from: b */
    private final SharedPreferences f239624b;

    public C88637j(SharedPreferences sharedPreferences, C88638k kVar) {
        this.f239624b = sharedPreferences;
        this.f239623a = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        Object obj2;
        C62940bt r0 = C62942bv.checkIsLite(aax.f237113a);
        akVar.mo58887l(r0);
        Object l = akVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        if (((aaw) obj).f237111b.equals(this.f239624b.getString("search_widget_current_hint_list", BuildConfig.FLAVOR))) {
            C88638k kVar = this.f239623a;
            C62940bt r1 = C62942bv.checkIsLite(aax.f237113a);
            akVar.mo58887l(r1);
            Object l2 = akVar.f169962ag.mo58854l(r1.f169971d);
            if (l2 == null) {
                obj2 = r1.f169969b;
            } else {
                obj2 = r1.mo58889c(l2);
            }
            C89267j jVar = ((aaw) obj2).f237112c;
            if (jVar == null) {
                jVar = C89267j.f242039f;
            }
            kVar.mo82296a(jVar);
        }
        return C118826c.f331423b;
    }
}
