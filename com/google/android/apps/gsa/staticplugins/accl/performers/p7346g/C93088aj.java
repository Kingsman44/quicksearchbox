package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.os.Handler;
import android.support.p031v4.media.session.C0320v;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.search.shared.media.p6932a.C87577a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.aj */
/* compiled from: PG */
public final /* synthetic */ class C93088aj implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C93094ap f259673a;

    /* renamed from: b */
    public final /* synthetic */ String f259674b;

    /* renamed from: c */
    public final /* synthetic */ C0320v f259675c;

    /* renamed from: d */
    public final /* synthetic */ boolean f259676d;

    /* renamed from: e */
    public final /* synthetic */ C93093ao f259677e;

    public /* synthetic */ C93088aj(C93094ap apVar, String str, C0320v vVar, boolean z, C93093ao aoVar) {
        this.f259673a = apVar;
        this.f259674b = str;
        this.f259675c = vVar;
        this.f259676d = z;
        this.f259677e = aoVar;
    }

    public final void run() {
        C93094ap apVar = this.f259673a;
        String str = this.f259674b;
        C0320v vVar = this.f259675c;
        boolean z = this.f259676d;
        C93093ao aoVar = this.f259677e;
        ((C59052c) ((C59052c) C93094ap.f259690a.mo56224b()).mo56372aa(13361)).mo56354G("Media Operation Type: %s sent to package: %s", str, vVar.mo1039g());
        if (z) {
            C87594r rVar = (C87594r) apVar.f259694d.mo27525b();
            vVar.mo1040h(apVar.f259696f, (Handler) null);
        } else {
            vVar.mo1040h(((C87594r) apVar.f259694d.mo27525b()).f236650c, (Handler) null);
        }
        aoVar.mo87529a(vVar.mo1037e());
        C87577a.f236619a = str;
    }
}
