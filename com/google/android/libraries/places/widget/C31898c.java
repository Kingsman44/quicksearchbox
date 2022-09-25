package com.google.android.libraries.places.widget;

import android.app.PendingIntent;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;

/* renamed from: com.google.android.libraries.places.widget.c */
/* compiled from: PG */
public final /* synthetic */ class C31898c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutocompleteActivity f85782a;

    public /* synthetic */ C31898c(AutocompleteActivity autocompleteActivity) {
        this.f85782a = autocompleteActivity;
    }

    public final void onClick(View view) {
        AutocompleteActivity autocompleteActivity = this.f85782a;
        if (autocompleteActivity.f85776k) {
            autocompleteActivity.mo37635v(0, (Place) null, new Status(1, 16, (String) null, (PendingIntent) null, (ConnectionResult) null));
        }
    }
}
