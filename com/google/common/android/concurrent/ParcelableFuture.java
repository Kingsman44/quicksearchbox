package com.google.common.android.concurrent;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
public final class ParcelableFuture implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C58297v();

    /* renamed from: a */
    public final int f155815a;

    /* renamed from: b */
    public final Object f155816b;

    /* renamed from: c */
    public C60870cx f155817c;

    /* renamed from: d */
    public C58298w f155818d;

    public ParcelableFuture(int i, Object obj, C60870cx cxVar) {
        this.f155815a = i;
        this.f155816b = obj;
        this.f155817c = cxVar;
    }

    public ParcelableFuture(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.f155815a = parcel.readInt();
        this.f155816b = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            this.f155817c = C60856cj.m92899h(new C58276aa("ParcelableFuture was Parceled before the Future completed."));
        } else if (readInt == 1) {
            this.f155817c = C60856cj.m92900i(parcel.readValue(classLoader));
        } else if (readInt == 2) {
            this.f155817c = C60856cj.m92899h((Throwable) parcel.readValue(classLoader));
        } else {
            throw new IllegalArgumentException("Unknown result type: " + readInt);
        }
        mo54848a();
    }

    /* renamed from: a */
    public final void mo54848a() {
        C58298w wVar = this.f155818d;
        if (wVar != null && mo54849b()) {
            try {
                ((C58295t) wVar).mo54862c(this, new C58292q((C58295t) wVar, this, C60856cj.m92909r(this.f155817c)));
            } catch (ExecutionException e) {
                wVar.mo54861b(this, e.getCause());
            } catch (Error | RuntimeException e2) {
                wVar.mo54861b(this, e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo54849b() {
        return this.f155817c.isDone();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        Object obj = this.f155816b;
        if (obj != null) {
            str = "input=" + obj.getClass().getName() + ";";
        } else {
            str = BuildConfig.FLAVOR;
        }
        return "ParcelableFuture(" + str + "future=" + String.valueOf(this.f155817c) + ")";
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d A[Catch:{ RuntimeException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            int r9 = r7.f155815a
            r8.writeInt(r9)
            boolean r9 = r7.mo54849b()
            r0 = 1
            r1 = 2
            r2 = 0
            if (r9 == 0) goto L_0x0025
            com.google.common.util.concurrent.cx r9 = r7.f155817c     // Catch:{ ExecutionException -> 0x001c, RuntimeException -> 0x001a, Error -> 0x0018 }
            java.lang.Object r9 = com.google.common.util.concurrent.C60856cj.m92909r(r9)     // Catch:{ ExecutionException -> 0x001c, RuntimeException -> 0x001a, Error -> 0x0018 }
            r3 = r9
            r4 = r2
            r9 = 1
            goto L_0x0028
        L_0x0018:
            r9 = move-exception
            goto L_0x0021
        L_0x001a:
            r9 = move-exception
            goto L_0x0021
        L_0x001c:
            r9 = move-exception
            java.lang.Throwable r9 = r9.getCause()
        L_0x0021:
            r4 = r9
            r3 = r2
            r9 = 2
            goto L_0x0028
        L_0x0025:
            r9 = 0
            r3 = r2
            r4 = r3
        L_0x0028:
            int r5 = r8.dataPosition()
            java.lang.Object r6 = r7.f155816b     // Catch:{ RuntimeException -> 0x0033 }
            r8.writeValue(r6)     // Catch:{ RuntimeException -> 0x0033 }
            r2 = r3
            goto L_0x0064
        L_0x0033:
            r9 = move-exception
            r8.setDataPosition(r5)
            r8.writeValue(r2)
            com.google.common.android.concurrent.aa r4 = new com.google.common.android.concurrent.aa
            java.lang.Object r3 = r7.f155816b
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Parceling failed for type and will be dropped: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = "; "
            r5.append(r3)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            r4.<init>(r9)
            r9 = 2
        L_0x0064:
            int r3 = r8.dataPosition()
            r8.writeInt(r9)     // Catch:{ RuntimeException -> 0x0077 }
            if (r9 == 0) goto L_0x0076
            if (r9 == r0) goto L_0x0073
            r8.writeValue(r4)     // Catch:{ RuntimeException -> 0x0077 }
            return
        L_0x0073:
            r8.writeValue(r2)     // Catch:{ RuntimeException -> 0x0077 }
        L_0x0076:
            return
        L_0x0077:
            r9 = move-exception
            r8.setDataPosition(r3)
            com.google.common.android.concurrent.aa r0 = new com.google.common.android.concurrent.aa
            java.lang.String r9 = r9.getMessage()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r2 = "Parceling failed for result and will be dropped: "
            java.lang.String r9 = r2.concat(r9)
            r0.<init>(r9)
            r8.writeInt(r1)
            r8.writeValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.android.concurrent.ParcelableFuture.writeToParcel(android.os.Parcel, int):void");
    }
}
