package com.google.android.apps.search.weather.suggestions;

import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.weather.suggestions.b */
/* compiled from: PG */
public final class C142132b {

    /* renamed from: a */
    public final TextView f385586a;

    /* renamed from: b */
    public final C47770dh f385587b;

    /* renamed from: c */
    public final C28306ab f385588c;

    /* renamed from: d */
    public final C28310af f385589d;

    /* renamed from: e */
    public final C28443m f385590e;

    public C142132b(SuggestionView suggestionView, C47770dh dhVar, C28306ab abVar, C28310af afVar, C28443m mVar) {
        this.f385586a = (TextView) suggestionView.findViewById(R.id.weather_suggested_location);
        this.f385587b = dhVar;
        this.f385588c = abVar;
        this.f385589d = afVar;
        this.f385590e = mVar;
    }
}
