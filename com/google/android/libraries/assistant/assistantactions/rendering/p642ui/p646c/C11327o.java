package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.places.api.C31779a;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.C31895a;
import com.google.android.libraries.places.widget.internal.common.AutocompleteActivityOrigin;
import com.google.android.libraries.places.widget.internal.common.C31913a;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.o */
/* compiled from: PG */
public final class C11327o {

    /* renamed from: a */
    public static final C59071e f36800a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.c.o");

    /* renamed from: c */
    private static final C58485gu f36801c = C58485gu.m89848p(Place.Field.ADDRESS, Place.Field.NAME, Place.Field.LAT_LNG);

    /* renamed from: b */
    protected final C11326n f36802b;

    /* renamed from: d */
    private final Context f36803d;

    public C11327o(Context context, C11326n nVar) {
        this.f36803d = context;
        this.f36802b = nVar;
    }

    /* renamed from: a */
    public final void mo19761a() {
        if (!C31779a.m59139d()) {
            Context context = this.f36803d;
            C31779a.m59138c(context, context.getResources().getString(R.string.reminders_maps_api_key));
        }
        AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.OVERLAY;
        C58485gu guVar = f36801c;
        AutocompleteActivityOrigin autocompleteActivityOrigin = AutocompleteActivityOrigin.INTENT;
        C31913a aVar = new C31913a();
        aVar.f85830e = C58485gu.m89842j(new ArrayList());
        aVar.f85831f = C58485gu.m89842j(new ArrayList());
        if (autocompleteActivityMode != null) {
            aVar.f85826a = autocompleteActivityMode;
            aVar.f85827b = C58485gu.m89842j(guVar);
            if (autocompleteActivityOrigin != null) {
                aVar.f85828c = autocompleteActivityOrigin;
                aVar.mo37673a(0);
                aVar.mo37674b(0);
                this.f36802b.mo19760d(C31895a.m59411a(this.f36803d, aVar), new C11325m(this));
                return;
            }
            throw new NullPointerException("Null origin");
        }
        throw new NullPointerException("Null mode");
    }
}
