package com.google.android.libraries.notifications.p2294i.p2295a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.notifications.C29986f;
import com.google.android.libraries.notifications.data.C29787a;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29822m;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.p2268e.p2283h.C29929b;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.protobuf.MessageLite;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68958v;

/* renamed from: com.google.android.libraries.notifications.i.a.f */
/* compiled from: PG */
public final class C30023f implements C29929b {

    /* renamed from: a */
    private final C29823n f81248a;

    public C30023f(C29823n nVar) {
        this.f81248a = nVar;
    }

    /* renamed from: a */
    public final void mo35219a(C29820k kVar, MessageLite messageLite, Throwable th) {
        Object[] objArr = new Object[1];
        objArr[0] = kVar != null ? kVar.mo35009h() : BuildConfig.FLAVOR;
        C30058b.m55795g("RemoveTargetCallback", th, "Unregistration finished for account: %s (FAILURE).", objArr);
        if (kVar != null) {
            if (!C68958v.m100020c()) {
                try {
                    kVar = this.f81248a.mo35088b(kVar.mo35009h());
                } catch (C29822m unused) {
                    return;
                }
            }
            C29787a l = kVar.mo35014l();
            l.mo34999e(C29986f.FAILED_UNREGISTRATION);
            this.f81248a.mo35091e(l.mo34995a());
        }
    }

    /* renamed from: b */
    public final void mo35220b(C29820k kVar, MessageLite messageLite, MessageLite messageLite2) {
        Object[] objArr = new Object[1];
        objArr[0] = kVar != null ? kVar.mo35009h() : BuildConfig.FLAVOR;
        C30058b.m55794f("RemoveTargetCallback", "Unregistration finished for account: %s (SUCCESS).", objArr);
        if (kVar != null) {
            if (!C68958v.m100020c()) {
                try {
                    kVar = this.f81248a.mo35088b(kVar.mo35009h());
                } catch (C29822m unused) {
                    return;
                }
            }
            C29787a l = kVar.mo35014l();
            l.mo34999e(C29986f.UNREGISTERED);
            l.f80718f = 0L;
            l.f80717e = 0L;
            l.mo34998d(0);
            this.f81248a.mo35091e(l.mo34995a());
        }
    }
}
