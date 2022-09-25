package com.google.android.libraries.places.widget.internal.common;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.places.widget.internal.common.i */
/* compiled from: PG */
public final class C31921i {
    /* renamed from: a */
    public static Status m59480a(Intent intent) {
        try {
            C58838bb.m90866a(intent, "Intent must not be null.");
            Status status = (Status) intent.getParcelableExtra("places/status");
            C58838bb.m90866a(status, "Intent expected to contain a Status, but doesn't.");
            return status;
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: b */
    public static Place m59481b(Intent intent) {
        try {
            C58838bb.m90866a(intent, "Intent must not be null.");
            Place place = (Place) intent.getParcelableExtra("places/selected_place");
            C58838bb.m90866a(place, "Intent expected to contain a Place, but doesn't.");
            return place;
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }
}
