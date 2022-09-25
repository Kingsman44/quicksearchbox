package com.google.android.apps.gsa.assistant.settings.p526e.p528b;

import android.content.ContentResolver;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.assistant.settings.p526e.C9751c;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.apps.gsa.contacts.m;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.b.f */
/* compiled from: PG */
public final class C9743f implements C73740a {

    /* renamed from: a */
    public static final String[] f33640a = {"_id", "photo_uri"};

    /* renamed from: b */
    public final C9751c f33641b;

    /* renamed from: c */
    public final ContentResolver f33642c;

    /* renamed from: d */
    public final m f33643d;

    /* renamed from: e */
    private final C91097g f33644e;

    public C9743f(C91097g gVar, C9751c cVar, ContentResolver contentResolver, m mVar) {
        this.f33644e = gVar;
        this.f33641b = cVar;
        this.f33642c = contentResolver;
        this.f33643d = mVar;
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "contactPickerNativeInterface";
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    @JavascriptInterface
    public void selectContact() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("vnd.android.cursor.dir/contact");
        this.f33644e.mo65090b(intent, new C9742e(this));
    }
}
