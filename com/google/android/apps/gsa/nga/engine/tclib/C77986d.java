package com.google.android.apps.gsa.nga.engine.tclib;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82440fg;
import com.google.android.libraries.mdi.C29690f;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.tclib.d */
/* compiled from: PG */
public final /* synthetic */ class C77986d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ TcLibWrapper f214773a;

    /* renamed from: b */
    public final /* synthetic */ String f214774b;

    /* renamed from: c */
    public final /* synthetic */ C29690f f214775c;

    public /* synthetic */ C77986d(TcLibWrapper tcLibWrapper, String str, C29690f fVar) {
        this.f214773a = tcLibWrapper;
        this.f214774b = str;
        this.f214775c = fVar;
    }

    public final void accept(Object obj) {
        TcLibWrapper tcLibWrapper = this.f214773a;
        String str = this.f214774b;
        C29690f fVar = this.f214775c;
        String str2 = (String) obj;
        C83305i iVar = tcLibWrapper.f214751g;
        int i = fVar.f80414e;
        if (str2 != null) {
            iVar.mo75579d(new C82440fg("NGA_TCLIB_RESOURCE_ERRORS_SUMMARY", str, i, str2));
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
