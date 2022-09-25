package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78253d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78243b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78523af;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78526ai;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78569x;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78571z;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a.C78306ba;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a.C78307bb;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80757ee;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80758ef;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C60321oe;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.s */
/* compiled from: PG */
public final class C78516s implements C78728n {

    /* renamed from: a */
    public final C83357g f216243a = new C83361k(true, C78263m.class);

    /* renamed from: b */
    public final C83358h f216244b;

    /* renamed from: c */
    public final C78253d f216245c;

    /* renamed from: d */
    private final C81515c f216246d;

    /* renamed from: e */
    private final C83358h f216247e;

    /* renamed from: f */
    private final C78510m f216248f;

    /* renamed from: g */
    private final C78307bb f216249g;

    /* renamed from: h */
    private C78243b f216250h;

    public C78516s(C81515c cVar, C83358h hVar, C83358h hVar2, C78253d dVar, C78510m mVar, C78307bb bbVar) {
        this.f216246d = cVar;
        this.f216244b = hVar;
        this.f216247e = hVar2;
        this.f216245c = dVar;
        this.f216248f = mVar;
        this.f216249g = bbVar;
    }

    /* renamed from: a */
    public final C78526ai mo73432a(C78537at atVar) {
        int i;
        String str;
        C80758ef efVar;
        Locale locale = (Locale) ((C83361k) this.f216247e).f227199b.get();
        C78523af f = C78526ai.m126143f();
        f.mo73455e(atVar.mo73447a());
        C78569x xVar = (C78569x) f;
        xVar.f216320b = BuildConfig.FLAVOR;
        int a = atVar.mo73447a();
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            f.mo73454d(this.f216246d.mo75121a(locale).getString(R.string.nga_greeting_initializing, new Object[0]));
            return f.mo73451a();
        } else if (i2 == 1) {
            f.mo73454d(this.f216246d.mo75121a(locale).getString(R.string.nga_greeting_default, new Object[0]));
            return f.mo73451a();
        } else if (i2 == 2) {
            f.mo73454d(this.f216246d.mo75121a(locale).getString(R.string.nga_greeting_delayed, new Object[0]));
            return f.mo73451a();
        } else if (i2 == 3) {
            String string = this.f216246d.mo75121a(locale).getString(R.string.nga_greeting_speech_engine_reset, new Object[0]);
            C28292j jVar = new C28292j(87639);
            jVar.mo33794h(1);
            C60321oe b = C28285c.m52875b(C28293k.m52907d(jVar, C58485gu.m89845m()), 88203);
            C78523af f2 = C78526ai.m126143f();
            f2.mo73454d(string);
            f2.mo73455e(4);
            ((C78569x) f2).f216320b = BuildConfig.FLAVOR;
            C78526ai a2 = f2.mo73451a();
            if (b == null) {
                b = C60321oe.f163224i;
            }
            a2.f216267a = C58833ax.m90834k(new C78571z(jVar, b));
            return a2;
        } else if (i2 != 4) {
            switch (i2) {
                case 8:
                    f.mo73454d(this.f216246d.mo75121a(locale).getString(R.string.nga_screen_context_permission_explanation_setting_on, new Object[0]));
                    return f.mo73451a();
                case 9:
                    f.mo73454d(this.f216246d.mo75121a(locale).getString(R.string.nga_screen_context_permission_explanation_setting_off, new Object[0]));
                    return f.mo73451a();
                case 10:
                    if (mo73433b()) {
                        C78243b b2 = ((C78245d) this.f216244b.mo76657c()).mo73180b();
                        if (!b2.equals(this.f216250h)) {
                            this.f216250h = b2;
                            if (((C78245d) this.f216244b.mo76657c()).mo73180b().mo73175h() != 4) {
                                Optional a3 = this.f216249g.mo73299a(this.f216245c.mo73201D());
                                if (!a3.isPresent()) {
                                    f.mo73454d(this.f216246d.mo75121a(locale).getString(R.string.nga_greeting_default, new Object[0]));
                                } else {
                                    xVar.f216319a = BuildConfig.FLAVOR;
                                    String string2 = this.f216246d.mo75121a(locale).getString(R.string.nga_greeting_default, new Object[0]);
                                    C78306ba baVar = (C78306ba) a3.get();
                                    if (this.f216245c.mo73201D() == 2) {
                                        C80757ee eeVar = (C80757ee) C80758ef.f221662e.createBuilder();
                                        String e = baVar.mo73297e();
                                        eeVar.copyOnWrite();
                                        e.getClass();
                                        ((C80758ef) eeVar.instance).f221665b = e;
                                        String d = baVar.mo73296d();
                                        eeVar.copyOnWrite();
                                        d.getClass();
                                        ((C80758ef) eeVar.instance).f221667d = d;
                                        efVar = (C80758ef) eeVar.build();
                                    } else {
                                        C80757ee eeVar2 = (C80757ee) C80758ef.f221662e.createBuilder();
                                        eeVar2.copyOnWrite();
                                        string2.getClass();
                                        ((C80758ef) eeVar2.instance).f221665b = string2;
                                        String e2 = baVar.mo73297e();
                                        eeVar2.copyOnWrite();
                                        C80758ef efVar2 = (C80758ef) eeVar2.instance;
                                        e2.getClass();
                                        efVar2.f221664a |= 1;
                                        efVar2.f221666c = e2;
                                        String d2 = baVar.mo73296d();
                                        eeVar2.copyOnWrite();
                                        d2.getClass();
                                        ((C80758ef) eeVar2.instance).f221667d = d2;
                                        efVar = (C80758ef) eeVar2.build();
                                    }
                                    f.mo73453c(efVar);
                                    f.mo73452b(((C78306ba) a3.get()).mo73294b());
                                }
                                return f.mo73451a();
                            }
                        }
                        xVar.f216319a = BuildConfig.FLAVOR;
                        return f.mo73451a();
                    }
                    C78510m mVar = this.f216248f;
                    Locale locale2 = (Locale) ((C83361k) mVar.f216222b).f227199b.get();
                    String a4 = mVar.f216224d.mo73234a();
                    boolean z = a4 != null && !a4.isEmpty();
                    C58485gu u = mVar.f216223c.mo73221u();
                    if (u == null || u.isEmpty()) {
                        i = 0;
                    } else {
                        Integer num = (Integer) u.get(mVar.f216225e.f216295a.nextInt(u.size()));
                        if (!z && C78510m.m126108b(num.intValue())) {
                            num = Integer.valueOf(num.intValue() - 100);
                        }
                        i = num.intValue();
                    }
                    if (C78510m.m126108b(i)) {
                        str = mVar.f216221a.mo75121a(locale2).getString(mVar.mo73431a(Integer.valueOf(i)), new Object[]{a4});
                    } else {
                        str = mVar.f216221a.mo75121a(locale2).getString(mVar.mo73431a(Integer.valueOf(i)), new Object[0]);
                    }
                    f.mo73454d(str);
                    return f.mo73451a();
                case 11:
                    f.mo73454d(this.f216246d.mo75121a(locale).getString(R.string.nga_account_fix_prompt, new Object[0]));
                    return f.mo73451a();
                case 12:
                    String string3 = this.f216246d.mo75121a(locale).getString(R.string.nga_static_text, new Object[0]);
                    if (string3 != null) {
                        xVar.f216320b = string3;
                        f.mo73454d(this.f216246d.mo75121a(locale).getString(R.string.nga_greeting_default, new Object[0]));
                        return f.mo73451a();
                    }
                    throw new NullPointerException("Null bottomText");
                default:
                    C78523af f3 = C78526ai.m126143f();
                    C78569x xVar2 = (C78569x) f3;
                    xVar2.f216319a = BuildConfig.FLAVOR;
                    f3.mo73455e(7);
                    xVar2.f216320b = BuildConfig.FLAVOR;
                    return f3.mo73451a();
            }
        } else {
            f.mo73454d(this.f216246d.mo75121a(locale).getString(R.string.nga_execution_in_progress_message, new Object[0]));
            return f.mo73451a();
        }
    }

    /* renamed from: b */
    public final boolean mo73433b() {
        if (!this.f216245c.mo73226z()) {
            return false;
        }
        if (this.f216245c.mo73201D() == 2 || this.f216245c.mo73201D() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo73112h() {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo73113i() {
    }

    /* renamed from: j */
    public final void mo73114j() {
        this.f216243a.mo76660b(false);
    }

    /* renamed from: k */
    public final void mo73115k() {
        this.f216243a.mo76660b(true);
    }
}
