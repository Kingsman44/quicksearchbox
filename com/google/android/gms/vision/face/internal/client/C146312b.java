package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.gms.vision.internal.client.C146318a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.vision.face.internal.client.b */
/* compiled from: PG */
public final class C146312b extends C146318a {

    /* renamed from: d */
    private final FaceSettingsParcel f395211d;

    public C146312b(Context context, FaceSettingsParcel faceSettingsParcel) {
        super(context, "FaceNativeHandle", "face");
        this.f395211d = faceSettingsParcel;
        mo122883b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo122875a(DynamiteModule dynamiteModule, Context context) {
        C146316f fVar;
        IBinder c = dynamiteModule.mo119687c("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
        C146315e eVar = null;
        if (c == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = c.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
            fVar = queryLocalInterface instanceof C146316f ? (C146316f) queryLocalInterface : new C146316f(c);
        }
        if (fVar == null) {
            return null;
        }
        C144166k kVar = new C144166k(context);
        FaceSettingsParcel faceSettingsParcel = this.f395211d;
        Parcel gA = fVar.mo17260gA();
        C8850c.m23499h(gA, kVar);
        C8850c.m23497f(gA, faceSettingsParcel);
        Parcel gT = fVar.mo17261gT(1, gA);
        IBinder readStrongBinder = gT.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            eVar = queryLocalInterface2 instanceof C146315e ? (C146315e) queryLocalInterface2 : new C146315e(readStrongBinder);
        }
        gT.recycle();
        return eVar;
    }
}
