package com.google.android.apps.gsa.staticplugins.p7930es;

import android.content.ContentResolver;
import android.content.ContentValues;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.n */
/* compiled from: PG */
public final /* synthetic */ class C100659n implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100664s f281470a;

    /* renamed from: b */
    public final /* synthetic */ long f281471b;

    /* renamed from: c */
    public final /* synthetic */ int f281472c;

    public /* synthetic */ C100659n(C100664s sVar, long j, int i) {
        this.f281470a = sVar;
        this.f281471b = j;
        this.f281472c = i;
    }

    public final void run() {
        C100664s sVar = this.f281470a;
        long j = this.f281471b;
        int i = this.f281472c;
        try {
            ContentResolver contentResolver = sVar.f281484b.getContentResolver();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("type", Integer.valueOf(i));
            contentResolver.update(C100666u.f281495b, contentValues, "_id = ?", new String[]{String.valueOf(j)});
        } catch (Exception e) {
            throw new C100665t(e);
        } catch (C100665t e2) {
            ((C59052c) ((C59052c) ((C59052c) C100664s.f281482a.mo56225c()).mo56382g(e2)).mo56372aa(33963)).mo56386p("Exception updating SMS status in database");
        }
    }
}
