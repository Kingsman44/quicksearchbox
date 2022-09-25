package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import com.google.android.apps.gsa.binaries.satin.app.C73961br;
import dagger.hilt.C68286a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: dagger.hilt.android.internal.managers.a */
/* compiled from: PG */
public class C68314a implements C68288b {

    /* renamed from: a */
    protected final Activity f184659a;

    /* renamed from: b */
    private volatile Object f184660b;

    /* renamed from: c */
    private final Object f184661c = new Object();

    /* renamed from: d */
    private final C68288b f184662d;

    /* renamed from: dagger.hilt.android.internal.managers.a$a */
    /* compiled from: PG */
    public interface C68315a {
        /* renamed from: b */
        C73961br mo60325b();
    }

    public C68314a(Activity activity) {
        this.f184659a = activity;
        this.f184662d = activity instanceof ComponentActivity ? new C68317c((ComponentActivity) activity) : new C68321e(activity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo51143a() {
        if (this.f184659a.getApplication() instanceof C68288b) {
            C73961br b = ((C68315a) C68286a.m98629a(this.f184662d, C68315a.class)).mo60325b();
            b.f205466a = this.f184659a;
            return b.mo69046a();
        } else if (Application.class.equals(this.f184659a.getApplication().getClass())) {
            throw new IllegalStateException("Sting Activity must be attached to an @Sting Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
        } else {
            throw new IllegalStateException("Sting Activity must be attached to an @Sting Application. Found: ".concat(String.valueOf(String.valueOf(this.f184659a.getApplication().getClass()))));
        }
    }

    /* renamed from: b */
    public final Object mo60324b() {
        return this.f184662d.mo17653jN();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        if (this.f184660b == null) {
            synchronized (this.f184661c) {
                if (this.f184660b == null) {
                    this.f184660b = mo51143a();
                }
            }
        }
        return this.f184660b;
    }
}
