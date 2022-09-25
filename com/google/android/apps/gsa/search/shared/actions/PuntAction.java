package com.google.android.apps.gsa.search.shared.actions;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.common.base.C58838bb;
import com.google.p4152bb.p4153a.C55421x;

/* compiled from: PG */
public class PuntAction extends VisitableAbstractVoiceAction {
    public static final Parcelable.Creator CREATOR = new C87474q();

    /* renamed from: f */
    private int f236013f;

    /* renamed from: g */
    private boolean f236014g;

    /* renamed from: j */
    public final CharSequence f236015j;

    /* renamed from: k */
    public final int f236016k;

    /* renamed from: l */
    public final int f236017l;

    /* renamed from: m */
    public final Intent f236018m;

    /* renamed from: n */
    public final int f236019n;

    /* renamed from: o */
    public C55421x f236020o;

    /* renamed from: p */
    public TtsRequest f236021p;

    protected PuntAction(Parcel parcel) {
        super(parcel);
        this.f236015j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f236016k = parcel.readInt();
        this.f236017l = parcel.readInt();
        this.f236018m = (Intent) parcel.readParcelable(getClass().getClassLoader());
        this.f236019n = parcel.readInt();
        C55421x a = C55421x.m87686a(parcel.readInt());
        C58838bb.m90866a(a, "actionTypeForLogging");
        this.f236020o = a;
        this.f236013f = parcel.readInt();
        this.f236014g = parcel.readByte() != 1 ? false : true;
        this.f236021p = (TtsRequest) parcel.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: L */
    public Object mo81132L(C87501w wVar) {
        return wVar.mo81495b(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        return this.f236018m != null;
    }

    /* renamed from: N */
    public final void mo81134N(int i) {
        this.f236014g = true;
        this.f236013f = i;
    }

    /* renamed from: g */
    public final C55421x mo81066g() {
        return this.f236020o;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f236015j, parcel, i);
        parcel.writeInt(this.f236016k);
        parcel.writeInt(this.f236017l);
        parcel.writeParcelable(this.f236018m, i);
        parcel.writeInt(this.f236019n);
        parcel.writeInt(this.f236020o.f146230cP);
        parcel.writeInt(this.f236013f);
        parcel.writeByte(this.f236014g ? (byte) 1 : 0);
        parcel.writeParcelable(this.f236021p, i);
    }

    public PuntAction(CharSequence charSequence) {
        this(charSequence, 0, 0, (Intent) null, 0, C55421x.PUNT);
    }

    public PuntAction(CharSequence charSequence, int i, int i2, Intent intent, int i3, C55421x xVar) {
        this.f236015j = charSequence;
        this.f236016k = i;
        this.f236017l = i2;
        this.f236018m = intent;
        this.f236019n = i3;
        this.f236020o = xVar;
    }

    public PuntAction(CharSequence charSequence, int i, Intent intent, int i2) {
        this(charSequence, 0, i, intent, i2, C55421x.PUNT);
    }
}
