package com.google.apps.tiktok.concurrent.futuresmixin;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* compiled from: PG */
public final class ParcelableFuture implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C46452r();

    /* renamed from: f */
    private static final C59071e f121527f = C59071e.m91332i("com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture");

    /* renamed from: a */
    public final int f121528a;

    /* renamed from: b */
    public boolean f121529b;

    /* renamed from: c */
    C58833ax f121530c = C58836b.f156633a;

    /* renamed from: d */
    public Object f121531d;

    /* renamed from: e */
    public Object f121532e;

    /* renamed from: g */
    private Throwable f121533g;

    /* renamed from: h */
    private C46453s f121534h;

    public ParcelableFuture(int i, Object obj, C60870cx cxVar) {
        this.f121528a = i;
        this.f121531d = obj;
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C46451q(this)), C60826bg.f164896a);
    }

    /* renamed from: d */
    private static void m82797d(Object obj, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        try {
            parcel.writeValue(obj);
        } catch (RuntimeException e) {
            parcel.setDataPosition(dataPosition);
            ((C59052c) ((C59052c) ((C59052c) f121527f.mo56225c()).mo56382g(e)).mo56372aa(54733)).mo56386p("Result lost due to non-parcelable type.");
            throw new IllegalArgumentException("Type not supported by Parcel and will be dropped: ".concat(String.valueOf(String.valueOf(obj.getClass()))), e);
        }
    }

    /* renamed from: a */
    public final void mo50432a() {
        C46453s sVar = this.f121534h;
        if (sVar != null) {
            Throwable th = this.f121533g;
            if (th != null) {
                FuturesMixinViewModel futuresMixinViewModel = (FuturesMixinViewModel) sVar;
                futuresMixinViewModel.f121521a.execute(C47810es.m84977q(new C46449o(futuresMixinViewModel, this, th)));
                return;
            }
            FuturesMixinViewModel futuresMixinViewModel2 = (FuturesMixinViewModel) sVar;
            futuresMixinViewModel2.f121521a.execute(C47810es.m84977q(new C46448n(futuresMixinViewModel2, this, this.f121532e)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo50433b(Throwable th) {
        this.f121533g = th;
        this.f121529b = true;
        mo50432a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo50434c(C46453s sVar) {
        this.f121534h = sVar;
        if (sVar != null && this.f121529b) {
            mo50432a();
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        String str2;
        Object obj = this.f121531d;
        String str3 = BuildConfig.FLAVOR;
        if (obj != null) {
            str = "input=" + obj.getClass().getName() + ";";
        } else {
            str = str3;
        }
        Object obj2 = this.f121532e;
        if (obj2 != null) {
            str2 = "result=" + obj2.getClass().getName() + ";";
        } else {
            str2 = str3;
        }
        Throwable th = this.f121533g;
        if (th != null) {
            str3 = "error=" + th.getClass().getName() + ";";
        }
        return "ParcelableFuture(" + str + str2 + str3 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121528a);
        int i2 = 1;
        try {
            m82797d(this.f121531d, parcel);
        } catch (RuntimeException e) {
            parcel.writeValue((Object) null);
            this.f121529b = true;
            this.f121533g = new IllegalArgumentException("FuturesMixin input isn't Parcelable.", e);
            this.f121532e = null;
        }
        if (true != this.f121529b) {
            i2 = 2;
        }
        parcel.writeInt(i2);
        if (this.f121529b) {
            try {
                m82797d(this.f121532e, parcel);
            } catch (RuntimeException e2) {
                parcel.writeValue((Object) null);
                this.f121533g = new IllegalArgumentException("FuturesMixin result isn't Parcelable.", e2);
            }
            try {
                m82797d(this.f121533g, parcel);
            } catch (RuntimeException e3) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("FuturesMixin result isn't Parcelable: ".concat(String.valueOf(String.valueOf(this.f121533g))), e3);
                this.f121533g = illegalArgumentException;
                m82797d(illegalArgumentException, parcel);
            }
        }
    }

    public ParcelableFuture(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.f121528a = parcel.readInt();
        try {
            this.f121531d = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            this.f121530c = C58833ax.m90834k(Integer.valueOf(readInt));
            if (readInt == 1) {
                this.f121529b = true;
                this.f121532e = parcel.readValue(classLoader);
                this.f121533g = (Throwable) parcel.readValue(classLoader);
            }
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f121527f.mo56225c()).mo56382g(e)).mo56372aa(54732)).mo56387q("Failed to unparcel value for %d.", this.f121528a);
            this.f121529b = true;
            this.f121533g = e;
        }
    }
}
