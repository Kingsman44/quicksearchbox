package com.google.android.apps.gsa.shared.p7195y;

import android.net.Uri;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.p297b.C5750ab;
import com.bumptech.glide.load.p297b.C5751ac;
import com.bumptech.glide.load.p297b.C5762an;
import com.bumptech.glide.load.p297b.C5763ao;
import com.bumptech.glide.load.p297b.C5764ap;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.shared.y.bd */
/* compiled from: PG */
public final class C91199bd implements C5764ap {

    /* renamed from: a */
    private final C5762an f254582a = new C5762an(250);

    /* renamed from: b */
    private final C5764ap f254583b;

    public C91199bd(C5764ap apVar) {
        this.f254583b = apVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        int i3;
        int i4;
        C91197bb bbVar = (C91197bb) obj;
        C5750ab abVar = (C5750ab) this.f254582a.mo12268a(bbVar, i, i2);
        if (abVar == null) {
            Uri parse = Uri.parse(bbVar.mo85472a());
            String queryParameter = parse.getQueryParameter("scale");
            if (queryParameter != null) {
                try {
                    float floatValue = Float.valueOf(queryParameter).floatValue();
                    i3 = (int) (((float) i) / floatValue);
                    i4 = (int) (((float) i2) / floatValue);
                } catch (NumberFormatException unused) {
                }
                C5750ab abVar2 = new C5750ab(parse.buildUpon().appendQueryParameter("w", String.valueOf(i3)).appendQueryParameter(C19618h.f54585a, String.valueOf(i4)).toString(), C5751ac.f17327a);
                this.f254582a.mo12269b(bbVar, i, i2, abVar2);
                abVar = abVar2;
            }
            i3 = i;
            i4 = i2;
            C5750ab abVar22 = new C5750ab(parse.buildUpon().appendQueryParameter("w", String.valueOf(i3)).appendQueryParameter(C19618h.f54585a, String.valueOf(i4)).toString(), C5751ac.f17327a);
            this.f254582a.mo12269b(bbVar, i, i2, abVar22);
            abVar = abVar22;
        }
        C5763ao a = this.f254583b.mo11928a(abVar, i, i2, sVar);
        if (a == null) {
            return null;
        }
        return new C5763ao(abVar, Collections.emptyList(), a.f17348c);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo11929b(Object obj) {
        C91197bb bbVar = (C91197bb) obj;
        return true;
    }
}
