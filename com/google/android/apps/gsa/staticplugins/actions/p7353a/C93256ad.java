package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.ContentValues;
import android.content.Context;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C93256ad implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C93264al f260024a;

    /* renamed from: b */
    public final /* synthetic */ long f260025b;

    /* renamed from: c */
    public final /* synthetic */ int f260026c;

    public /* synthetic */ C93256ad(C93264al alVar, long j, int i) {
        this.f260024a = alVar;
        this.f260025b = j;
        this.f260026c = i;
    }

    public final void run() {
        C93264al alVar = this.f260024a;
        long j = this.f260025b;
        int i = this.f260026c;
        try {
            Context context = alVar.f260044b;
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("type", Integer.valueOf(i));
            context.getContentResolver().update(C93266an.f260053a, contentValues, "_id = ?", new String[]{String.valueOf(j)});
        } catch (Exception e) {
            throw new C93265am(e);
        } catch (C93265am e2) {
            ((C59052c) ((C59052c) ((C59052c) C93264al.f260043a.mo56225c()).mo56382g(e2)).mo56372aa(13555)).mo56386p("Exception updating SMS status in database");
        }
    }
}
