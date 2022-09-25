package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import android.content.Context;
import com.google.android.libraries.places.api.C31779a;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.C31895a;
import com.google.android.libraries.places.widget.internal.common.AutocompleteActivityOrigin;
import com.google.android.libraries.places.widget.internal.common.C31913a;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33170a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.n */
/* compiled from: PG */
public final class C33255n {

    /* renamed from: a */
    public static final C59071e f88919a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.n");

    /* renamed from: c */
    private static final C58485gu f88920c = C58485gu.m89848p(Place.Field.ADDRESS, Place.Field.NAME, Place.Field.LAT_LNG);

    /* renamed from: b */
    final C33254m f88921b;

    /* renamed from: d */
    private final Context f88922d;

    /* renamed from: e */
    private final C33170a f88923e;

    public C33255n(Context context, C33170a aVar, C33254m mVar) {
        this.f88922d = context;
        this.f88923e = aVar;
        this.f88921b = mVar;
    }

    /* renamed from: a */
    public final void mo38635a() {
        if (!C31779a.m59139d()) {
            C31779a.m59138c(this.f88922d, "AIzaSyB36jhYQRfdTRq2cY1hKmXnXk9mveJPCSE");
        }
        AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.OVERLAY;
        C58485gu guVar = f88920c;
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
                this.f88923e.mo38560b(C31895a.m59411a(this.f88922d, aVar), new C33253l(this));
                return;
            }
            throw new NullPointerException("Null origin");
        }
        throw new NullPointerException("Null mode");
    }
}
