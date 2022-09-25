package androidx.mediarouter.p175a;

import android.content.ComponentName;
import android.content.Context;
import androidx.core.p097i.C1968c;

/* renamed from: androidx.mediarouter.a.v */
/* compiled from: PG */
public class C3749v {

    /* renamed from: e */
    public final Context f12029e;

    /* renamed from: f */
    public final C3747t f12030f;

    /* renamed from: g */
    public final C3746s f12031g = new C3746s(this);

    /* renamed from: h */
    public C3741n f12032h;

    /* renamed from: i */
    public C3740m f12033i;

    /* renamed from: j */
    public boolean f12034j;

    /* renamed from: k */
    public C3751x f12035k;

    /* renamed from: l */
    public boolean f12036l;

    public C3749v(Context context, C3747t tVar) {
        if (context != null) {
            this.f12029e = context;
            if (tVar == null) {
                this.f12030f = new C3747t(new ComponentName(context, getClass()));
            } else {
                this.f12030f = tVar;
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    /* renamed from: c */
    public C3748u mo7823c(String str) {
        throw null;
    }

    /* renamed from: f */
    public void mo7825f(C3740m mVar) {
    }

    /* renamed from: fi */
    public C3745r mo7826fi(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* renamed from: fk */
    public final void mo7914fk(C3751x xVar) {
        C3687aw.m10684i();
        if (this.f12035k != xVar) {
            this.f12035k = xVar;
            if (!this.f12036l) {
                this.f12036l = true;
                this.f12031g.sendEmptyMessage(1);
            }
        }
    }

    /* renamed from: fl */
    public final void mo7915fl(C3740m mVar) {
        C3687aw.m10684i();
        if (!C1968c.m5305b(this.f12033i, mVar)) {
            mo7916fm(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fm */
    public final void mo7916fm(C3740m mVar) {
        this.f12033i = mVar;
        if (!this.f12034j) {
            this.f12034j = true;
            this.f12031g.sendEmptyMessage(2);
        }
    }

    /* renamed from: fj */
    public C3748u mo7827fj(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return mo7823c(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }
}
