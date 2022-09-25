package androidx.p043a.p044a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: androidx.a.a.b */
/* compiled from: PG */
public final class C0782b extends ContextWrapper {

    /* renamed from: b */
    private static Configuration f2692b;

    /* renamed from: a */
    public int f2693a;

    /* renamed from: c */
    private Resources.Theme f2694c;

    /* renamed from: d */
    private LayoutInflater f2695d;

    /* renamed from: e */
    private Configuration f2696e;

    /* renamed from: f */
    private Resources f2697f;

    public C0782b() {
        super((Context) null);
    }

    /* renamed from: b */
    private final Resources m2612b() {
        if (this.f2697f == null) {
            Configuration configuration = this.f2696e;
            if (configuration != null) {
                if (f2692b == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f2692b = configuration2;
                }
                if (!configuration.equals(f2692b)) {
                    this.f2697f = C0781a.m2611a(this, this.f2696e).getResources();
                }
            }
            this.f2697f = super.getResources();
        }
        return this.f2697f;
    }

    /* renamed from: c */
    private final void m2613c() {
        if (this.f2694c == null) {
            this.f2694c = m2612b().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2694c.setTo(theme);
            }
        }
        this.f2694c.applyStyle(this.f2693a, true);
    }

    /* renamed from: a */
    public final void mo3324a(Configuration configuration) {
        if (this.f2697f != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f2696e == null) {
            this.f2696e = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final AssetManager getAssets() {
        return m2612b().getAssets();
    }

    public final Resources getResources() {
        return m2612b();
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2695d == null) {
            this.f2695d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2695d;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2694c;
        if (theme != null) {
            return theme;
        }
        if (this.f2693a == 0) {
            this.f2693a = 2132150596;
        }
        m2613c();
        return this.f2694c;
    }

    public final void setTheme(int i) {
        if (this.f2693a != i) {
            this.f2693a = i;
            m2613c();
        }
    }

    public C0782b(Context context, int i) {
        super(context);
        this.f2693a = i;
    }

    public C0782b(Context context, Resources.Theme theme) {
        super(context);
        this.f2694c = theme;
    }
}
