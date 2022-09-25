package com.google.android.apps.gsa.search.shared.multiuser;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.gsa.shared.util.debug.FeedbackData;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.search.shared.multiuser.e */
/* compiled from: PG */
public final class C87602e extends C8848a implements C87604g {
    public C87602e(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.search.shared.multiuser.IMultiUserDataSource");
    }

    /* renamed from: e */
    public final void mo81739e(C87601d dVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, dVar);
        mo17263hf(9, gA);
    }

    /* renamed from: f */
    public final void mo81740f(Uri uri, C87601d dVar) {
        throw null;
    }

    /* renamed from: g */
    public final void mo81741g(Uri uri, C87601d dVar) {
        throw null;
    }

    /* renamed from: h */
    public final void mo81742h(Intent intent, C87601d dVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        C8850c.m23499h(gA, dVar);
        mo17263hf(8, gA);
    }

    /* renamed from: i */
    public final void mo81743i(FeedbackData feedbackData, C87601d dVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, feedbackData);
        C8850c.m23499h(gA, dVar);
        mo17263hf(10, gA);
    }

    /* renamed from: j */
    public final void mo81744j(Intent intent, C87601d dVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        C8850c.m23499h(gA, dVar);
        mo17263hf(5, gA);
    }
}
