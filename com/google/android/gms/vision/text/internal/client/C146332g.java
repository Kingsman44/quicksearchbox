package com.google.android.gms.vision.text.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.gms.vision.internal.client.C146318a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.vision.text.internal.client.g */
/* compiled from: PG */
public final class C146332g extends C146318a {

    /* renamed from: d */
    private final TextRecognizerOptions f395256d;

    public C146332g(Context context, TextRecognizerOptions textRecognizerOptions) {
        super(context, "TextNativeHandle", "ocr");
        this.f395256d = textRecognizerOptions;
        mo122883b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo122875a(DynamiteModule dynamiteModule, Context context) {
        C146328c cVar;
        IBinder c = dynamiteModule.mo119687c("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
        C146327b bVar = null;
        if (c == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = c.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
            cVar = queryLocalInterface instanceof C146328c ? (C146328c) queryLocalInterface : new C146328c(c);
        }
        if (cVar == null) {
            return null;
        }
        C144166k kVar = new C144166k(context);
        TextRecognizerOptions textRecognizerOptions = this.f395256d;
        Parcel gA = cVar.mo17260gA();
        C8850c.m23499h(gA, kVar);
        C8850c.m23497f(gA, textRecognizerOptions);
        Parcel gT = cVar.mo17261gT(1, gA);
        IBinder readStrongBinder = gT.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            bVar = queryLocalInterface2 instanceof C146327b ? (C146327b) queryLocalInterface2 : new C146327b(readStrongBinder);
        }
        gT.recycle();
        return bVar;
    }
}
