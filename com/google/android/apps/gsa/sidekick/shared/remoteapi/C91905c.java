package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;
import com.google.android.sidekick.shared.remoteapi.TrainingQuestion;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.remoteapi.c */
/* compiled from: PG */
public final class C91905c extends C8848a implements C91907e {
    public C91905c(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.sidekick.shared.remoteapi.INowService");
    }

    /* renamed from: a */
    public final TrainingQuestion mo85972a(ProtoLiteParcelable protoLiteParcelable) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, protoLiteParcelable);
        Parcel gT = mo17261gT(4, gA);
        TrainingQuestion trainingQuestion = (TrainingQuestion) C8850c.m23492a(gT, TrainingQuestion.CREATOR);
        gT.recycle();
        return trainingQuestion;
    }

    /* renamed from: b */
    public final String mo85973b(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        Parcel gT = mo17261gT(15, gA);
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo85974c(ProtoLiteParcelable protoLiteParcelable, boolean z) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, protoLiteParcelable);
        C8850c.m23495d(gA, z);
        mo17263hf(2, gA);
    }

    /* renamed from: d */
    public final void mo85975d(int i, int i2) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        gA.writeInt(i2);
        mo17263hf(14, gA);
    }

    /* renamed from: e */
    public final void mo85976e() {
        mo17263hf(8, mo17260gA());
    }

    /* renamed from: f */
    public final void mo85977f(List list) {
        Parcel gA = mo17260gA();
        gA.writeTypedList(list);
        mo17263hf(1, gA);
    }

    /* renamed from: g */
    public final void mo85978g(ProtoLiteParcelable protoLiteParcelable, boolean z) {
        throw null;
    }

    /* renamed from: h */
    public final void mo85979h(List list) {
        Parcel gA = mo17260gA();
        gA.writeTypedList(list);
        mo17263hf(10, gA);
    }

    /* renamed from: i */
    public final void mo85980i(ProtoLiteParcelable protoLiteParcelable, int i, int i2) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, protoLiteParcelable);
        gA.writeInt(i);
        gA.writeInt(i2);
        mo17263hf(12, gA);
    }

    /* renamed from: j */
    public final void mo85981j(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17263hf(11, gA);
    }

    /* renamed from: k */
    public final void mo85982k(ProtoLiteParcelable protoLiteParcelable, ProtoLiteParcelable protoLiteParcelable2) {
        throw null;
    }

    /* renamed from: l */
    public final void mo85983l(ProtoLiteParcelable protoLiteParcelable, ProtoLiteParcelable protoLiteParcelable2, ProtoLiteParcelable protoLiteParcelable3) {
        throw null;
    }

    /* renamed from: m */
    public final void mo85984m(ProtoLiteParcelable protoLiteParcelable, ProtoLiteParcelable protoLiteParcelable2, ProtoLiteParcelable protoLiteParcelable3) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, protoLiteParcelable);
        C8850c.m23497f(gA, protoLiteParcelable2);
        C8850c.m23497f(gA, protoLiteParcelable3);
        mo17263hf(5, gA);
    }

    /* renamed from: n */
    public final void mo85985n(ProtoLiteParcelable protoLiteParcelable) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, protoLiteParcelable);
        mo17263hf(7, gA);
    }

    /* renamed from: o */
    public final void mo85986o(ProtoLiteParcelable protoLiteParcelable) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, protoLiteParcelable);
        mo17263hf(16, gA);
    }

    /* renamed from: p */
    public final boolean mo85987p() {
        Parcel gT = mo17261gT(9, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }
}
