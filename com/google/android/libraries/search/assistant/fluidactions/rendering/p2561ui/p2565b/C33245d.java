package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33170a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.d */
/* compiled from: PG */
public final class C33245d {

    /* renamed from: a */
    public static final C59071e f88893a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.d");

    /* renamed from: b */
    public final C33170a f88894b;

    /* renamed from: c */
    private final C33244c f88895c;

    public C33245d(C33244c cVar, C33170a aVar) {
        this.f88895c = cVar;
        this.f88894b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo38631a(ActivityResult activityResult) {
        Intent intent = activityResult.f2756b;
        if (intent == null) {
            ((C59052c) ((C59052c) f88893a.mo56226d()).mo56372aa(51167)).mo56386p("Failed to select a contact, invalid data");
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            ((C59052c) ((C59052c) f88893a.mo56226d()).mo56372aa(51166)).mo56386p("Failed to select a contact, invalid URI");
            return;
        }
        try {
            this.f88895c.mo38630h(ContentUris.parseId(data));
        } catch (NumberFormatException | UnsupportedOperationException e) {
            ((C59052c) ((C59052c) ((C59052c) f88893a.mo56226d()).mo56382g(e)).mo56372aa(51165)).mo56386p("Unexpected contact selection data");
        }
    }
}
