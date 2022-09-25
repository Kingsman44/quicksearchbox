package androidx.navigation;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C2354bb;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.navigation.k */
/* compiled from: PG */
final class C3890k extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C3892m f12474a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3890k(C3892m mVar) {
        super(0);
        this.f12474a = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Context context = this.f12474a.f12476a;
        Application application = null;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        C3892m mVar = this.f12474a;
        return new C2354bb(application, mVar, mVar.f12478c);
    }
}
