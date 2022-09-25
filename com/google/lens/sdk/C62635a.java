package com.google.lens.sdk;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import com.google.lens.p4707j.C62471cu;

/* renamed from: com.google.lens.sdk.a */
/* compiled from: PG */
public final class C62635a extends C62646l {

    /* renamed from: a */
    public Uri f169113a;

    /* renamed from: b */
    public Bitmap f169114b;

    /* renamed from: c */
    public String f169115c;

    /* renamed from: d */
    public Location f169116d;

    /* renamed from: e */
    public String f169117e;

    /* renamed from: f */
    public Long f169118f;

    /* renamed from: g */
    public C62471cu f169119g;

    /* renamed from: h */
    public Integer f169120h;

    /* renamed from: i */
    public String f169121i;

    /* renamed from: j */
    public Boolean f169122j;

    public C62635a() {
    }

    public C62635a(C62647m mVar) {
        C62636b bVar = (C62636b) mVar;
        this.f169113a = bVar.f169123a;
        this.f169114b = bVar.f169124b;
        this.f169115c = bVar.f169125c;
        this.f169116d = bVar.f169126d;
        this.f169117e = bVar.f169127e;
        this.f169118f = bVar.f169129g;
        this.f169119g = bVar.f169130h;
        this.f169120h = bVar.f169131i;
        this.f169121i = bVar.f169132j;
        this.f169122j = bVar.f169133k;
    }

    /* renamed from: a */
    public final C62647m mo58535a() {
        return new C62636b(this.f169113a, this.f169114b, this.f169115c, this.f169116d, this.f169117e, this.f169118f, this.f169119g, this.f169120h, this.f169121i, this.f169122j);
    }

    /* renamed from: b */
    public final void mo58536b(Bitmap bitmap) {
        this.f169114b = bitmap;
    }

    /* renamed from: c */
    public final void mo58537c(Long l) {
        this.f169118f = l;
    }
}
