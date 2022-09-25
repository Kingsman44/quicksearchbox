package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.unifiedime.C118587e;
import com.google.android.apps.gsa.unifiedime.C118588f;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4946az.C64354b;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.i */
/* compiled from: PG */
public final class C125503i {

    /* renamed from: a */
    public static final C125503i f346078a = new C125503i(BuildConfig.FLAVOR, Locale.ROOT, C58485gu.m89845m());

    /* renamed from: d */
    private static final C59071e f346079d = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.i");

    /* renamed from: b */
    public final String f346080b;

    /* renamed from: c */
    public final C58485gu f346081c;

    /* renamed from: e */
    private final Locale f346082e;

    private C125503i(String str, Locale locale, C58485gu guVar) {
        this.f346081c = guVar;
        this.f346080b = str;
        this.f346082e = locale;
    }

    /* renamed from: a */
    public static C118588f m205471a(C118588f fVar, int i, int i2) {
        if (fVar.f330862b < i || i2 == 0) {
            return fVar;
        }
        C118587e eVar = (C118587e) fVar.toBuilder();
        int i3 = fVar.f330862b;
        eVar.copyOnWrite();
        C118588f fVar2 = (C118588f) eVar.instance;
        fVar2.f330861a |= 1;
        fVar2.f330862b = i3 + i2;
        return (C118588f) eVar.build();
    }

    /* renamed from: c */
    public static C125503i m205472c(String str, Locale locale, C58485gu guVar) {
        String p = C125470af.f346005c.mo56195p(str);
        int length = str.length() - p.length();
        return new C125503i(p, locale, m205473f(guVar, length, -length));
    }

    /* renamed from: f */
    public static C58485gu m205473f(C58485gu guVar, int i, int i2) {
        return i2 == 0 ? guVar : (C58485gu) Collection.EL.stream(guVar).map(new C125500f(i, i2)).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final C125503i mo106992b(C125503i iVar) {
        C47558bi a = C47831fm.m85006a("SD.AltSpansTracker.Concat");
        try {
            if (iVar.f346080b.isEmpty()) {
                a.close();
                return this;
            } else if (this.f346080b.isEmpty()) {
                a.close();
                return iVar;
            } else {
                String str = this.f346080b + " " + iVar.f346080b;
                C58480gp e = C58485gu.m89837e();
                e.mo55396h(this.f346081c);
                e.mo55396h((Iterable) Collection.EL.stream(iVar.f346081c).map(new C125502h(this.f346080b.length() + 1)).collect(C58370cn.f155946a));
                C58485gu f = e.mo55394f();
                if (!this.f346082e.equals(Locale.ROOT) && !this.f346082e.equals(iVar.f346082e)) {
                    ((C59052c) ((C59052c) f346079d.mo56226d()).mo56372aa(36578)).mo56354G("#concat: locale mismatch current: %s, added: %s [SD]", this.f346082e, iVar.f346082e);
                }
                C125503i iVar2 = new C125503i(str, iVar.f346082e, f);
                a.close();
                return iVar2;
            }
        } catch (Throwable th) {
            C125464a.m205441a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final C125503i mo106993d(C64354b bVar) {
        return mo106994e((String) Collection.EL.stream(bVar.f173956a).flatMap(C125491b.f346052a).filter(C125497c.f346070a).collect(Collectors.joining(" ")));
    }

    /* renamed from: e */
    public final C125503i mo106994e(String str) {
        C47558bi a = C47831fm.m85006a("SD.AltSpansTracker.Sub");
        try {
            int indexOf = this.f346080b.toLowerCase(this.f346082e).indexOf(str.toLowerCase(this.f346082e));
            if (indexOf < 0) {
                ((C59052c) ((C59052c) f346079d.mo56226d()).mo56372aa(36580)).mo56354G("Did not find %s in %s [SD]", str, this.f346080b);
                C125503i iVar = f346078a;
                a.close();
                return iVar;
            }
            int length = str.length();
            C125503i iVar2 = new C125503i(str, this.f346082e, (C58485gu) Collection.EL.stream(this.f346081c).filter(new C125498d(indexOf, length)).map(new C125499e(indexOf)).collect(C58370cn.f155946a));
            a.close();
            return iVar2;
        } catch (Throwable th) {
            C125464a.m205441a(th, th);
        }
        throw th;
    }
}
