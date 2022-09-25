package com.p232a.p233a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Picture;
import androidx.p060c.C0983m;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* renamed from: com.a.a.bp */
/* compiled from: PG */
public final class C4734bp {

    /* renamed from: a */
    public C4707ap f14859a = null;

    /* renamed from: b */
    public final C4758e f14860b = new C4758e();

    /* renamed from: c */
    final Map f14861c = new HashMap();

    static {
        new DecimalFormat("#.0000");
        new C0983m(10);
    }

    protected C4734bp() {
    }

    /* renamed from: d */
    public static C4734bp m13118d(InputStream inputStream) {
        return new C4756ck().mo9659b(inputStream);
    }

    /* renamed from: e */
    public static C4734bp m13119e(Context context, int i) {
        Resources resources = context.getResources();
        C4756ck ckVar = new C4756ck();
        InputStream openRawResource = resources.openRawResource(i);
        try {
            return ckVar.mo9659b(openRawResource);
        } finally {
            try {
                openRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: j */
    private final C4713av m13120j(C4711at atVar, String str) {
        C4713av j;
        C4713av avVar = (C4713av) atVar;
        if (str.equals(avVar.f14824o)) {
            return avVar;
        }
        for (C4715ax axVar : atVar.mo9602n()) {
            if (axVar instanceof C4713av) {
                C4713av avVar2 = (C4713av) axVar;
                if (str.equals(avVar2.f14824o)) {
                    return avVar2;
                }
                if ((axVar instanceof C4711at) && (j = m13120j((C4711at) axVar, str)) != null) {
                    return j;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    private final C4766m m13121k() {
        int i;
        float f;
        int i2;
        C4707ap apVar = this.f14859a;
        C4779z zVar = apVar.f14811c;
        C4779z zVar2 = apVar.f14812d;
        if (zVar == null || zVar.mo9686f() || (i = zVar.f15134b) == 9 || i == 2 || i == 3) {
            return new C4766m(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float g = zVar.mo9687g();
        if (zVar2 == null) {
            C4766m mVar = apVar.f14841w;
            f = mVar != null ? (mVar.f15104d * g) / mVar.f15103c : g;
        } else if (zVar2.mo9686f() || (i2 = zVar2.f15134b) == 9 || i2 == 2 || i2 == 3) {
            return new C4766m(-1.0f, -1.0f, -1.0f, -1.0f);
        } else {
            f = zVar2.mo9687g();
        }
        return new C4766m(0.0f, 0.0f, g, f);
    }

    /* renamed from: a */
    public final float mo9618a() {
        if (this.f14859a != null) {
            return m13121k().f15104d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: b */
    public final float mo9619b() {
        if (this.f14859a != null) {
            return m13121k().f15103c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C4715ax mo9620c(String str) {
        String substring;
        if (str == null || str.length() <= 1 || !str.startsWith("#") || (substring = str.substring(1)) == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(this.f14859a.f14824o)) {
            return this.f14859a;
        }
        if (this.f14861c.containsKey(substring)) {
            return (C4715ax) this.f14861c.get(substring);
        }
        C4713av j = m13120j(this.f14859a, substring);
        this.f14861c.put(substring, j);
        return j;
    }

    /* renamed from: f */
    public final void mo9621f(float f) {
        C4707ap apVar = this.f14859a;
        if (apVar != null) {
            apVar.f14812d = new C4779z(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: g */
    public final void mo9622g(float f) {
        C4707ap apVar = this.f14859a;
        if (apVar != null) {
            apVar.f14811c = new C4779z(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: h */
    public final Picture mo9623h(int i, int i2) {
        Picture picture = new Picture();
        C4746ca caVar = new C4746ca(picture.beginRecording(i, i2), new C4766m(0.0f, 0.0f, (float) i, (float) i2));
        caVar.f14915c = this;
        C4707ap apVar = this.f14859a;
        if (apVar == null) {
            C4746ca.m13181h("Nothing to render. Document is empty.", new Object[0]);
        } else {
            caVar.f14916d = new C4741bw();
            caVar.f14917e = new Stack();
            caVar.mo9635g(caVar.f14916d, C4706ao.m13074a());
            C4741bw bwVar = caVar.f14916d;
            bwVar.f14891f = caVar.f14914b;
            bwVar.f14893h = false;
            bwVar.f14894i = false;
            caVar.f14917e.push(bwVar.clone());
            new Stack();
            new Stack();
            caVar.f14919g = new Stack();
            caVar.f14918f = new Stack();
            caVar.mo9633d(apVar);
            caVar.mo9634f(apVar, apVar.f14811c, apVar.f14812d, apVar.f14841w, apVar.f14835v);
        }
        picture.endRecording();
        return picture;
    }

    /* renamed from: i */
    public final Picture mo9624i() {
        float f;
        C4707ap apVar = this.f14859a;
        C4779z zVar = apVar.f14811c;
        if (zVar == null) {
            return mo9623h(512, 512);
        }
        float g = zVar.mo9687g();
        C4766m mVar = apVar.f14841w;
        if (mVar != null) {
            f = (mVar.f15104d * g) / mVar.f15103c;
        } else {
            C4779z zVar2 = apVar.f14812d;
            f = zVar2 != null ? zVar2.mo9687g() : g;
        }
        return mo9623h((int) Math.ceil((double) g), (int) Math.ceil((double) f));
    }
}
