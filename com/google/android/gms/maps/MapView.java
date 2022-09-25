package com.google.android.gms.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
public class MapView extends FrameLayout {

    /* renamed from: a */
    public final C145009f f391987a;

    public MapView(Context context) {
        super(context);
        this.f391987a = new C145009f(this, context, (GoogleMapOptions) null);
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f391987a = new C145009f(this, context, GoogleMapOptions.m235658a(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f391987a = new C145009f(this, context, GoogleMapOptions.m235658a(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f391987a = new C145009f(this, context, googleMapOptions);
        setClickable(true);
    }
}
