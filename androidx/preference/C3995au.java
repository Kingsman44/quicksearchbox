package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;

/* renamed from: androidx.preference.au */
/* compiled from: PG */
public final class C3995au {

    /* renamed from: a */
    public final Context f12829a;

    /* renamed from: b */
    public SharedPreferences f12830b;

    /* renamed from: c */
    public C4028x f12831c;

    /* renamed from: d */
    public boolean f12832d;

    /* renamed from: e */
    public String f12833e;

    /* renamed from: f */
    public PreferenceScreen f12834f;

    /* renamed from: g */
    public C3994at f12835g;

    /* renamed from: h */
    public C3992ar f12836h;

    /* renamed from: i */
    public C3993as f12837i;

    /* renamed from: j */
    private long f12838j = 0;

    /* renamed from: k */
    private SharedPreferences.Editor f12839k;

    public C3995au(Context context) {
        this.f12829a = context;
        this.f12833e = String.valueOf(context.getPackageName()).concat("_preferences");
        this.f12830b = null;
    }

    /* renamed from: h */
    private final void m11513h(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f12839k) != null) {
            editor.apply();
        }
        this.f12832d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo8428a() {
        long j;
        synchronized (this) {
            j = this.f12838j;
            this.f12838j = 1 + j;
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final SharedPreferences.Editor mo8429b() {
        if (this.f12831c != null) {
            return null;
        }
        if (!this.f12832d) {
            return mo8430c().edit();
        }
        if (this.f12839k == null) {
            this.f12839k = mo8430c().edit();
        }
        return this.f12839k;
    }

    /* renamed from: c */
    public final SharedPreferences mo8430c() {
        if (this.f12831c != null) {
            return null;
        }
        if (this.f12830b == null) {
            this.f12830b = this.f12829a.getSharedPreferences(this.f12833e, 0);
        }
        return this.f12830b;
    }

    /* renamed from: d */
    public final Preference mo8431d(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f12834f;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.mo8382l(charSequence);
    }

    /* renamed from: e */
    public final PreferenceScreen mo8432e(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, (AttributeSet) null);
        preferenceScreen.mo8335B(this);
        return preferenceScreen;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public final PreferenceScreen mo8433f(Context context, int i, PreferenceScreen preferenceScreen) {
        m11513h(true);
        int i2 = C3991aq.f12826a;
        Object[] objArr = new Object[2];
        String[] strArr = {String.valueOf(Preference.class.getPackage().getName()).concat("."), String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".")};
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            Preference a = C3991aq.m11506a(xml, preferenceScreen, context, objArr, this, strArr);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) a;
            preferenceScreen2.mo8335B(this);
            m11513h(false);
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo8434g(Preference preference) {
        C3992ar arVar = this.f12836h;
        if (arVar != null) {
            arVar.mo8409gb(preference);
        }
    }
}
