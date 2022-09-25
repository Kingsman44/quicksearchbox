package com.google.android.apps.gsa.p6487s3;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.s3.d */
/* compiled from: PG */
public final class C84286d implements C84294l {

    /* renamed from: a */
    public static final C59071e f229364a = C59071e.m91332i("com.google.android.apps.gsa.s3.d");

    /* renamed from: b */
    public final C84295m f229365b;

    /* renamed from: c */
    public final C92439c f229366c;

    /* renamed from: d */
    public final ContentResolver f229367d;

    /* renamed from: e */
    public final Uri f229368e;

    /* renamed from: f */
    public Cursor f229369f;

    /* renamed from: g */
    private final C90931ca f229370g;

    /* renamed from: h */
    private final Handler f229371h;

    /* renamed from: i */
    private ContentObserver f229372i;

    /* renamed from: j */
    private CancellationSignal f229373j;

    public C84286d(C90931ca caVar, C84295m mVar, C92439c cVar, ContentResolver contentResolver, Looper looper, String str) {
        this.f229370g = caVar;
        this.f229365b = mVar;
        this.f229366c = cVar;
        this.f229367d = contentResolver;
        this.f229368e = Uri.parse(str);
        this.f229371h = new Handler(looper);
    }

    /* renamed from: a */
    public final void mo77824a() {
        C58976aa aaVar = C58975e.f156826a;
        CancellationSignal cancellationSignal = new CancellationSignal();
        this.f229373j = cancellationSignal;
        this.f229369f = this.f229367d.query(this.f229368e, new String[0], (String) null, new String[0], (String) null, cancellationSignal);
        C84279a aVar = new C84279a(this, this.f229371h);
        this.f229372i = aVar;
        this.f229367d.registerContentObserver(this.f229368e, false, aVar);
        this.f229370g.mo85139d(new C84284b(this));
    }

    /* renamed from: b */
    public final void mo77825b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f229367d.unregisterContentObserver(this.f229372i);
        this.f229373j.cancel();
        this.f229369f.close();
        this.f229366c.mo87119b();
    }
}
