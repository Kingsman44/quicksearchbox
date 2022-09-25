package com.google.android.gms.cast;

import android.app.PendingIntent;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.C143562aa;
import com.google.android.gms.cast.internal.C143587m;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.cast.ak */
/* compiled from: PG */
final class C143353ak extends C143562aa {

    /* renamed from: a */
    final /* synthetic */ C143354al f388775a;

    public C143353ak(C143354al alVar) {
        this.f388775a = alVar;
    }

    /* renamed from: a */
    public final void mo118467a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        C143354al alVar = this.f388775a;
        alVar.f388788j = applicationMetadata;
        alVar.f388789k = str;
        C143587m mVar = new C143587m(new Status(1, 0, (String) null, (PendingIntent) null, (ConnectionResult) null), applicationMetadata, str, str2, z);
        synchronized (alVar.f388786h) {
            C146010af afVar = alVar.f388783e;
            if (afVar != null) {
                afVar.f394698a.mo122508v(mVar);
            }
            alVar.f388783e = null;
        }
    }

    /* renamed from: b */
    public final void mo118468b(int i) {
        this.f388775a.mo118494n(i);
    }

    /* renamed from: c */
    public final void mo118469c(int i) {
        this.f388775a.mo118496p(i);
        C143354al alVar = this.f388775a;
        if (alVar.f388798t != null) {
            alVar.mo118490i().post(new C143347ae(this, i));
        }
    }

    /* renamed from: d */
    public final void mo118470d(int i) {
        this.f388775a.mo118496p(i);
    }

    /* renamed from: e */
    public final void mo118471e(ApplicationStatus applicationStatus) {
        this.f388775a.mo118490i().post(new C143346ad(this, applicationStatus));
    }

    /* renamed from: f */
    public final void mo118472f(int i) {
        this.f388775a.mo118496p(i);
    }

    /* renamed from: g */
    public final void mo118473g(String str, byte[] bArr) {
        C143354al.f388778a.mo118884b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    /* renamed from: h */
    public final void mo118474h(int i) {
        this.f388775a.mo118490i().post(new C143352aj(this, i));
    }

    /* renamed from: i */
    public final void mo118475i(DeviceStatus deviceStatus) {
        this.f388775a.mo118490i().post(new C143348af(this, deviceStatus));
    }

    /* renamed from: j */
    public final void mo118476j(int i) {
        this.f388775a.mo118490i().post(new C143349ag(this, i));
    }

    /* renamed from: k */
    public final void mo118477k(int i) {
        this.f388775a.mo118490i().post(new C143350ah(this, i));
    }

    /* renamed from: l */
    public final void mo118478l(String str, String str2) {
        C143354al.f388778a.mo118884b("Receive (type=text, ns=%s) %s", str, str2);
        this.f388775a.mo118490i().post(new C143351ai(this, str, str2));
    }

    /* renamed from: m */
    public final void mo118479m(long j) {
        this.f388775a.mo118495o(j, 0);
    }

    /* renamed from: n */
    public final void mo118480n(long j, int i) {
        this.f388775a.mo118495o(j, i);
    }

    /* renamed from: o */
    public final void mo118481o() {
        C143354al.f388778a.mo118884b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}
