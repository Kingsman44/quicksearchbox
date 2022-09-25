package com.google.android.apps.gsa.staticplugins.p8163o;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.p137a.C2725bn;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10890h.p10891a.p10893b.C146574e;
import com.google.android.p10890h.p10891a.p10893b.C146577h;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.ao */
/* compiled from: PG */
public final class C105804ao {

    /* renamed from: a */
    private final Context f295162a;

    /* renamed from: b */
    private final C89012aj f295163b;

    /* renamed from: c */
    private final C22871g f295164c;

    /* renamed from: d */
    private final C86054o f295165d;

    /* renamed from: e */
    private final C86124t f295166e;

    public C105804ao(Context context, C89012aj ajVar, C22871g gVar, C86054o oVar, C86124t tVar) {
        this.f295162a = context;
        this.f295163b = ajVar;
        this.f295164c = gVar;
        this.f295165d = oVar;
        this.f295166e = tVar;
    }

    /* renamed from: a */
    public final C146577h mo95071a(String str, String str2, Map map, Uri uri, Uri... uriArr) {
        Context context = this.f295162a;
        C89012aj ajVar = this.f295163b;
        C22871g gVar = this.f295164c;
        C146574e eVar = new C146574e(Collections.emptyMap(), new C105799aj(this.f295165d, ajVar), new C105800ak(gVar));
        return new C146577h(context, eVar, new C105797ah(str, uriArr, this.f295166e, uri), new C105798ai(str2, map), new C2725bn((byte[]) null));
    }
}
