package com.google.android.libraries.assistant.soda;

import android.os.Build;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C66763ad;
import com.google.speech.p5218j.C66764ae;
import com.google.speech.p5218j.C66963fz;
import com.google.speech.p5218j.C66965ga;
import com.google.speech.p5218j.C66980gp;
import com.google.speech.p5218j.C66981gq;
import com.google.speech.p5218j.C66984gt;
import com.google.speech.p5218j.C66985gu;
import com.google.speech.p5218j.C66994hc;
import com.google.speech.p5218j.C66997hf;
import com.google.speech.p5218j.C66998hg;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67174s;
import com.google.speech.p5218j.C67175t;
import com.google.speech.p5218j.p5219a.C66744k;
import com.google.speech.p5218j.p5219a.C66745l;
import com.google.speech.p5218j.p5219a.C66746m;
import com.google.speech.p5218j.p5219a.C66750q;
import com.google.speech.p5218j.p5219a.C66751r;
import com.google.speech.p5218j.p5219a.C66752s;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.soda.ah */
/* compiled from: PG */
public final class C19245ah {

    /* renamed from: a */
    private static final C59071e f53925a = C59071e.m91332i("com.google.android.libraries.assistant.soda.ah");

    /* renamed from: a */
    public static int m36693a(String str) {
        Path path = Paths.get(str, new String[]{"metadata"});
        if (!Files.exists(path, new LinkOption[0])) {
            return -1;
        }
        try {
            return ((C8476as) C62942bv.parseFrom((C62942bv) C8476as.f29413p, Files.readAllBytes(path))).f29419d;
        } catch (Exception unused) {
            return -2;
        }
    }

    /* renamed from: b */
    public static int m36694b(C67175t tVar) {
        int i = tVar.f182593d;
        C67174s a = C67174s.m97431a(tVar.f182591b);
        if (a == null) {
            a = C67174s.INT16;
        }
        return i * m36695c(a);
    }

    /* renamed from: c */
    public static int m36695c(C67174s sVar) {
        C67174s sVar2 = C67174s.INVALID;
        int ordinal = sVar.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2 || ordinal == 3) {
            return 4;
        }
        throw new IllegalArgumentException(String.format("Unexpected SampleFormat: %d", new Object[]{Integer.valueOf(sVar.f182587e)}));
    }

    /* renamed from: d */
    public static C8476as m36696d(String str) {
        Path path = Paths.get(str, new String[]{"metadata"});
        if (!Files.exists(path, new LinkOption[0])) {
            ((C59052c) ((C59052c) f53925a.mo56226d()).mo56372aa(47669)).mo56389s("LP directory '%s' does not have a metadata file.", str);
            return null;
        }
        try {
            return (C8476as) C62942bv.parseFrom((C62942bv) C8476as.f29413p, Files.readAllBytes(path));
        } catch (Exception unused) {
            ((C59052c) ((C59052c) f53925a.mo56226d()).mo56372aa(47668)).mo56389s("LP directory '%s' has an invalid metadata file.", str);
            return null;
        }
    }

    /* renamed from: e */
    public static C67172q m36697e() {
        C67172q qVar = (C67172q) C67175t.f182588e.createBuilder();
        C67174s sVar = C67174s.INT16;
        qVar.copyOnWrite();
        C67175t tVar = (C67175t) qVar.instance;
        tVar.f182591b = sVar.f182587e;
        tVar.f182590a |= 1;
        qVar.copyOnWrite();
        C67175t tVar2 = (C67175t) qVar.instance;
        tVar2.f182590a |= 4;
        tVar2.f182593d = 1;
        qVar.copyOnWrite();
        C67175t tVar3 = (C67175t) qVar.instance;
        tVar3.f182590a |= 2;
        tVar3.f182592c = 16000;
        return qVar;
    }

    /* renamed from: f */
    public static C66998hg m36698f(String str, String str2, String str3) {
        return m36707o(str, str2, str3, 1, BuildConfig.FLAVOR);
    }

    /* renamed from: g */
    public static C66998hg m36699g(String str, String str2, String str3) {
        C66998hg o = m36707o(str, BuildConfig.FLAVOR, str2, 1, BuildConfig.FLAVOR);
        if (str3 != null && !str3.isEmpty()) {
            C66984gt gtVar = (C66984gt) C66985gu.f182075h.createBuilder();
            C66980gp gpVar = (C66980gp) C66981gq.f182064g.createBuilder();
            gpVar.copyOnWrite();
            C66981gq gqVar = (C66981gq) gpVar.instance;
            gqVar.f182067b = 6;
            gqVar.f182068c = str3;
            gtVar.mo59756a(gpVar);
            o.copyOnWrite();
            C66999hh hhVar = (C66999hh) o.instance;
            C66985gu guVar = (C66985gu) gtVar.build();
            C66999hh hhVar2 = C66999hh.f182127p;
            guVar.getClass();
            hhVar.f182131c = guVar;
            hhVar.f182129a |= 2;
        }
        return o;
    }

    /* renamed from: h */
    public static C66746m m36700h(int i, int i2) {
        C66746m mVar = (C66746m) C66750q.f181536g.createBuilder();
        mVar.copyOnWrite();
        C66750q qVar = (C66750q) mVar.instance;
        qVar.f181539b = 0;
        qVar.f181538a |= 1;
        mVar.copyOnWrite();
        C66750q qVar2 = (C66750q) mVar.instance;
        qVar2.f181540c = 2;
        qVar2.f181538a |= 2;
        C67172q qVar3 = (C67172q) C67175t.f182588e.createBuilder();
        C67174s sVar = C67174s.INT16;
        qVar3.copyOnWrite();
        C67175t tVar = (C67175t) qVar3.instance;
        tVar.f182591b = sVar.f182587e;
        tVar.f182590a |= 1;
        qVar3.copyOnWrite();
        C67175t tVar2 = (C67175t) qVar3.instance;
        tVar2.f182590a |= 4;
        tVar2.f182593d = i2;
        qVar3.copyOnWrite();
        C67175t tVar3 = (C67175t) qVar3.instance;
        tVar3.f182590a = 2 | tVar3.f182590a;
        tVar3.f182592c = i;
        mVar.copyOnWrite();
        C66750q qVar4 = (C66750q) mVar.instance;
        C67175t tVar4 = (C67175t) qVar3.build();
        tVar4.getClass();
        qVar4.f181541d = tVar4;
        qVar4.f181538a |= 16;
        return mVar;
    }

    /* renamed from: i */
    public static String m36701i(String str) {
        Path path = Paths.get(str, new String[]{"metadata"});
        if (!Files.exists(path, new LinkOption[0])) {
            return BuildConfig.FLAVOR;
        }
        try {
            return ((C8476as) C62942bv.parseFrom((C62942bv) C8476as.f29413p, Files.readAllBytes(path))).f29417b;
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: j */
    public static void m36702j(C66751r rVar, int i, int i2) {
        C66744k kVar = (C66744k) C66745l.f181530c.createBuilder();
        C66746m h = m36700h(i, i2);
        kVar.copyOnWrite();
        C66745l lVar = (C66745l) kVar.instance;
        C66750q qVar = (C66750q) h.build();
        qVar.getClass();
        lVar.f181533b = qVar;
        lVar.f181532a = 1;
        rVar.copyOnWrite();
        C66752s sVar = (C66752s) rVar.instance;
        C66745l lVar2 = (C66745l) kVar.build();
        C66752s sVar2 = C66752s.f181544q;
        lVar2.getClass();
        sVar.f181550e = lVar2;
        sVar.f181546a |= 8;
    }

    /* renamed from: k */
    public static void m36703k(C66751r rVar, int i, int i2) {
        C66744k kVar = (C66744k) C66745l.f181530c.createBuilder();
        C66746m mVar = (C66746m) C66750q.f181536g.createBuilder();
        mVar.copyOnWrite();
        C66750q qVar = (C66750q) mVar.instance;
        qVar.f181539b = 2;
        qVar.f181538a |= 1;
        C67172q qVar2 = (C67172q) C67175t.f182588e.createBuilder();
        C67174s sVar = C67174s.INT16;
        qVar2.copyOnWrite();
        C67175t tVar = (C67175t) qVar2.instance;
        tVar.f182591b = sVar.f182587e;
        tVar.f182590a |= 1;
        qVar2.copyOnWrite();
        C67175t tVar2 = (C67175t) qVar2.instance;
        tVar2.f182590a |= 4;
        tVar2.f182593d = i2;
        qVar2.copyOnWrite();
        C67175t tVar3 = (C67175t) qVar2.instance;
        tVar3.f182590a = 2 | tVar3.f182590a;
        tVar3.f182592c = i;
        mVar.copyOnWrite();
        C66750q qVar3 = (C66750q) mVar.instance;
        C67175t tVar4 = (C67175t) qVar2.build();
        tVar4.getClass();
        qVar3.f181541d = tVar4;
        qVar3.f181538a |= 16;
        kVar.copyOnWrite();
        C66745l lVar = (C66745l) kVar.instance;
        C66750q qVar4 = (C66750q) mVar.build();
        qVar4.getClass();
        lVar.f181533b = qVar4;
        lVar.f181532a = 1;
        rVar.copyOnWrite();
        C66752s sVar2 = (C66752s) rVar.instance;
        C66745l lVar2 = (C66745l) kVar.build();
        C66752s sVar3 = C66752s.f181544q;
        lVar2.getClass();
        sVar2.f181550e = lVar2;
        sVar2.f181546a |= 8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = com.google.p395al.p408c.p414c.p416b.C8475ar.m23267a(r2.f29426k);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m36704l(java.lang.String r2) {
        /*
            com.google.al.c.c.b.as r2 = m36696d(r2)
            r0 = 0
            if (r2 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r2 = r2.f29426k
            int r2 = com.google.p395al.p408c.p414c.p416b.C8475ar.m23267a(r2)
            if (r2 != 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            r1 = 3
            if (r2 != r1) goto L_0x0016
            r2 = 1
            return r2
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.C19245ah.m36704l(java.lang.String):boolean");
    }

    /* renamed from: m */
    public static boolean m36705m(String str) {
        C8476as d = m36696d(str);
        return d != null && d.f29419d >= 500;
    }

    /* renamed from: n */
    public static boolean m36706n(String str, long j) {
        if (str.isEmpty()) {
            return false;
        }
        int a = m36693a(str);
        if (a == -1) {
            return true;
        }
        if (a == -2) {
            return false;
        }
        ((C59052c) ((C59052c) f53925a.mo56224b()).mo56372aa(47670)).mo56349B("Soda LP version: min(en-US)=%d, current=%d", j, a);
        String i = m36701i(str);
        if (!i.isEmpty() && Locale.forLanguageTag(i).equals(Locale.US) && ((long) a) < j) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static C66998hg m36707o(String str, String str2, String str3, int i, String str4) {
        C66998hg hgVar = (C66998hg) C66999hh.f182127p.createBuilder();
        hgVar.copyOnWrite();
        C66999hh hhVar = (C66999hh) hgVar.instance;
        str3.getClass();
        hhVar.f182129a |= 64;
        hhVar.f182135g = str3;
        C66994hc hcVar = (C66994hc) C66997hf.f182099z.createBuilder();
        hcVar.copyOnWrite();
        C66997hf hfVar = (C66997hf) hcVar.instance;
        str.getClass();
        hfVar.f182102a |= 32768;
        hfVar.f182115n = str;
        hgVar.copyOnWrite();
        C66999hh hhVar2 = (C66999hh) hgVar.instance;
        C66997hf hfVar2 = (C66997hf) hcVar.build();
        hfVar2.getClass();
        hhVar2.f182132d = hfVar2;
        hhVar2.f182129a |= 4;
        C66963fz fzVar = (C66963fz) C66965ga.f182027c.createBuilder();
        C67172q e = m36697e();
        fzVar.copyOnWrite();
        C66965ga gaVar = (C66965ga) fzVar.instance;
        C67175t tVar = (C67175t) e.build();
        tVar.getClass();
        gaVar.f182030b = tVar;
        gaVar.f182029a |= 1;
        hgVar.copyOnWrite();
        C66999hh hhVar3 = (C66999hh) hgVar.instance;
        C66965ga gaVar2 = (C66965ga) fzVar.build();
        gaVar2.getClass();
        hhVar3.f182130b = gaVar2;
        hhVar3.f182129a |= 1;
        C66764ae p = m36708p(i, str4);
        hgVar.copyOnWrite();
        C66999hh hhVar4 = (C66999hh) hgVar.instance;
        p.getClass();
        hhVar4.f182138j = p;
        hhVar4.f182129a |= 512;
        if (str2 != null && !str2.isEmpty()) {
            C66984gt gtVar = (C66984gt) C66985gu.f182075h.createBuilder();
            C66980gp gpVar = (C66980gp) C66981gq.f182064g.createBuilder();
            gpVar.copyOnWrite();
            C66981gq gqVar = (C66981gq) gpVar.instance;
            gqVar.f182067b = 5;
            gqVar.f182068c = str2;
            gtVar.mo59756a(gpVar);
            hgVar.copyOnWrite();
            C66999hh hhVar5 = (C66999hh) hgVar.instance;
            C66985gu guVar = (C66985gu) gtVar.build();
            guVar.getClass();
            hhVar5.f182131c = guVar;
            hhVar5.f182129a |= 2;
        }
        return hgVar;
    }

    /* renamed from: p */
    private static C66764ae m36708p(int i, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = BuildConfig.FLAVOR;
            }
        } catch (NoClassDefFoundError unused) {
        }
        C66763ad adVar = (C66763ad) C66764ae.f181577i.createBuilder();
        adVar.copyOnWrite();
        C66764ae aeVar = (C66764ae) adVar.instance;
        aeVar.f181581c = i - 1;
        aeVar.f181579a |= 2;
        adVar.copyOnWrite();
        C66764ae aeVar2 = (C66764ae) adVar.instance;
        str.getClass();
        aeVar2.f181579a |= 64;
        aeVar2.f181586h = str;
        adVar.copyOnWrite();
        C66764ae aeVar3 = (C66764ae) adVar.instance;
        aeVar3.f181579a |= 16;
        aeVar3.f181584f = "Android";
        try {
            String str2 = Build.MODEL;
            adVar.copyOnWrite();
            C66764ae aeVar4 = (C66764ae) adVar.instance;
            str2.getClass();
            aeVar4.f181579a |= 32;
            aeVar4.f181585g = str2;
        } catch (NoClassDefFoundError unused2) {
        }
        return (C66764ae) adVar.build();
    }
}
