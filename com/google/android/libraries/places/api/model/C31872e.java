package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.model.e */
/* compiled from: PG */
public final class C31872e extends C31892y {

    /* renamed from: a */
    public String f85754a;

    /* renamed from: b */
    public AddressComponents f85755b;

    /* renamed from: c */
    public Place.BusinessStatus f85756c;

    /* renamed from: d */
    public List f85757d;

    /* renamed from: e */
    public String f85758e;

    /* renamed from: f */
    public LatLng f85759f;

    /* renamed from: g */
    public String f85760g;

    /* renamed from: h */
    public OpeningHours f85761h;

    /* renamed from: i */
    public String f85762i;

    /* renamed from: j */
    public List f85763j;

    /* renamed from: k */
    public PlusCode f85764k;

    /* renamed from: l */
    public Integer f85765l;

    /* renamed from: m */
    public Double f85766m;

    /* renamed from: n */
    public List f85767n;

    /* renamed from: o */
    public Integer f85768o;

    /* renamed from: p */
    public Integer f85769p;

    /* renamed from: q */
    public LatLngBounds f85770q;

    /* renamed from: r */
    public Uri f85771r;

    /* renamed from: s */
    public String f85772s;

    /* renamed from: t */
    public Integer f85773t;

    /* renamed from: a */
    public final Place mo37598a() {
        return new AutoValue_Place(this.f85754a, this.f85755b, this.f85756c, this.f85757d, this.f85758e, this.f85759f, this.f85760g, this.f85761h, this.f85762i, this.f85763j, this.f85764k, this.f85765l, this.f85766m, this.f85767n, this.f85768o, this.f85769p, this.f85770q, this.f85771r, this.f85772s, this.f85773t);
    }

    /* renamed from: b */
    public final void mo37599b(List list) {
        this.f85757d = list;
    }

    /* renamed from: c */
    public final void mo37600c(List list) {
        this.f85763j = list;
    }

    /* renamed from: d */
    public final void mo37601d(List list) {
        this.f85767n = list;
    }
}
