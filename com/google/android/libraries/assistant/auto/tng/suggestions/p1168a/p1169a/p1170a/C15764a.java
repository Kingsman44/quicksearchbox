package com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1169a.p1170a;

import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1169a.C15763a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.a.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C15764a implements C15763a {

    /* renamed from: a */
    public final /* synthetic */ C15765b f46969a;

    public /* synthetic */ C15764a(C15765b bVar) {
        this.f46969a = bVar;
    }

    /* renamed from: a */
    public final void mo21857a(String str) {
        this.f46969a.f46970b.getContentResolver().notifyChange(Uri.parse("content://com.google.android.assistant.CarSuggestionProvider/suggestion/".concat(String.valueOf(str))), (ContentObserver) null, false);
    }
}
