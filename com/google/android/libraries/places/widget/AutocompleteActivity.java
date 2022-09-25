package com.google.android.libraries.places.widget;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.p033v7.app.C0395p;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.places.api.C31779a;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;
import com.google.android.libraries.places.widget.internal.common.AutocompleteOptions;
import com.google.android.libraries.places.widget.internal.p2441ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.internal.p2441ui.C31933h;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.p2439a.C31896a;
import com.google.common.base.C58838bb;

/* compiled from: PG */
public class AutocompleteActivity extends C0395p implements C31896a {

    /* renamed from: j */
    static boolean f85775j = true;

    /* renamed from: k */
    public boolean f85776k = false;

    /* renamed from: l */
    private int f85777l;

    /* renamed from: m */
    private int f85778m;

    public AutocompleteActivity() {
        super(R.layout.places_autocomplete_activity);
    }

    public final void onCreate(Bundle bundle) {
        try {
            C58838bb.m90884s(C31779a.m59139d(), "Places must be initialized.");
            boolean z = false;
            if (f85775j) {
                C58838bb.m90884s(getCallingActivity() != null, "Cannot find caller. startActivityForResult should be used.");
            }
            AutocompleteOptions autocompleteOptions = (AutocompleteOptions) getIntent().getParcelableExtra("places/AutocompleteOptions");
            autocompleteOptions.getClass();
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int ordinal = autocompleteOptions.mo37661g().ordinal();
            if (ordinal == 0) {
                this.f85777l = R.layout.places_autocomplete_impl_fragment_fullscreen;
                this.f85778m = R.style.PlacesAutocompleteFullscreen;
            } else if (ordinal == 1) {
                this.f85777l = R.layout.places_autocomplete_impl_fragment_overlay;
                this.f85778m = R.style.PlacesAutocompleteOverlay;
            }
            mo545jw().f651r = new C31933h(this.f85777l, this, autocompleteOptions);
            setTheme(this.f85778m);
            super.onCreate(bundle);
            AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) mo545jw().f634a.mo670b(R.id.places_autocomplete_content);
            if (autocompleteImplFragment != null) {
                z = true;
            }
            C58838bb.m90883r(z);
            autocompleteImplFragment.f85868b = this;
            View findViewById = findViewById(16908290);
            findViewById.setOnTouchListener(new C31897b(this, autocompleteImplFragment, findViewById));
            findViewById.setOnClickListener(new C31898c(this));
            if (autocompleteOptions.mo37664i().isEmpty()) {
                mo37635v(2, (Place) null, new Status(1, 9012, "Place Fields must not be empty.", (PendingIntent) null, (ConnectionResult) null));
            }
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: v */
    public final void mo37635v(int i, Place place, Status status) {
        try {
            Intent intent = new Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i, intent);
            finish();
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: w */
    public final void mo37636w(Status status) {
        mo37635v(true != status.mo119096b() ? 2 : 0, (Place) null, status);
    }

    /* renamed from: x */
    public final void mo37637x(Place place) {
        mo37635v(-1, place, Status.f389615a);
    }
}
