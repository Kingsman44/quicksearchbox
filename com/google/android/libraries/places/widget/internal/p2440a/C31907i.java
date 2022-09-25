package com.google.android.libraries.places.widget.internal.p2440a;

import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.android.libraries.places.widget.internal.common.AutocompleteOptions;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.places.widget.internal.a.i */
/* compiled from: PG */
public final class C31907i implements C31901c {

    /* renamed from: a */
    public static final C58485gu f85790a = C58485gu.m89847o(Place.Field.ID, Place.Field.TYPES);

    /* renamed from: b */
    public final C31863s f85791b;

    /* renamed from: c */
    public final AutocompleteOptions f85792c;

    /* renamed from: d */
    public final AutocompleteSessionToken f85793d;

    /* renamed from: e */
    public C31904f f85794e;

    /* renamed from: f */
    public C31905g f85795f;

    public C31907i(C31863s sVar, AutocompleteOptions autocompleteOptions, AutocompleteSessionToken autocompleteSessionToken) {
        this.f85791b = sVar;
        this.f85792c = autocompleteOptions;
        this.f85793d = autocompleteSessionToken;
    }

    /* renamed from: a */
    public final void mo37649a() {
        C31904f fVar = this.f85794e;
        if (fVar != null) {
            ((C31899a) fVar).f85783a.f394725a.f394724a.mo122510x((Object) null);
        }
        C31905g gVar = this.f85795f;
        if (gVar != null) {
            ((C31900b) gVar).f85785a.f394725a.f394724a.mo122510x((Object) null);
        }
        this.f85794e = null;
        this.f85795f = null;
    }
}
