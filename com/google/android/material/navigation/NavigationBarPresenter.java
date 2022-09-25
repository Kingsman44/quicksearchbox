package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.view.menu.C0451ae;
import android.support.p033v7.view.menu.C0452af;
import android.support.p033v7.view.menu.C0460an;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.view.menu.C0480t;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.p197u.C4199aj;
import androidx.p197u.C4202am;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.badge.C44536a;
import com.google.android.material.internal.ParcelableSparseArray;

/* compiled from: PG */
public final class NavigationBarPresenter implements C0452af {

    /* renamed from: a */
    public C44822i f116858a;

    /* renamed from: b */
    public boolean f116859b = false;

    /* renamed from: c */
    public int f116860c;

    /* renamed from: d */
    private C0477q f116861d;

    /* compiled from: PG */
    class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C44823j();

        /* renamed from: a */
        int f116862a;

        /* renamed from: b */
        ParcelableSparseArray f116863b;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f116862a = parcel.readInt();
            this.f116863b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f116862a);
            parcel.writeParcelable(this.f116863b, 0);
        }
    }

    /* renamed from: a */
    public final int mo1519a() {
        return this.f116860c;
    }

    /* renamed from: c */
    public final void mo1520c(Context context, C0477q qVar) {
        this.f116861d = qVar;
        this.f116858a.f116955x = qVar;
    }

    /* renamed from: d */
    public final void mo1543d(C0477q qVar, boolean z) {
    }

    /* renamed from: e */
    public final void mo1544e(C0451ae aeVar) {
        throw null;
    }

    /* renamed from: eI */
    public final Parcelable mo1545eI() {
        SavedState savedState = new SavedState();
        C44822i iVar = this.f116858a;
        savedState.f116862a = iVar.f116936e;
        SparseArray sparseArray = iVar.f116944m;
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            C44536a aVar = (C44536a) sparseArray.valueAt(i);
            if (aVar != null) {
                parcelableSparseArray.put(keyAt, aVar.f115814b.f115790a);
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        savedState.f116863b = parcelableSparseArray;
        return savedState;
    }

    /* renamed from: f */
    public final void mo1546f(boolean z) {
        C4202am amVar;
        if (!this.f116859b) {
            if (z) {
                this.f116858a.mo48231d();
                return;
            }
            C44822i iVar = this.f116858a;
            C0477q qVar = iVar.f116955x;
            if (qVar != null && iVar.f116935d != null) {
                int size = qVar.f1652c.size();
                if (size != iVar.f116935d.length) {
                    iVar.mo48231d();
                    return;
                }
                int i = iVar.f116936e;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item = iVar.f116955x.getItem(i2);
                    if (item.isChecked()) {
                        iVar.f116936e = item.getItemId();
                        iVar.f116937f = i2;
                    }
                }
                if (!(i == iVar.f116936e || (amVar = iVar.f116933b) == null)) {
                    C4199aj.m12054b(iVar, amVar);
                }
                boolean f = iVar.mo48233f(iVar.f116934c, iVar.f116955x.mo1654e().size());
                for (int i3 = 0; i3 < size; i3++) {
                    iVar.f116954w.f116859b = true;
                    iVar.f116935d[i3].mo48223u(iVar.f116934c);
                    iVar.f116935d[i3].mo48224v(f);
                    iVar.f116935d[i3].mo1446f((C0480t) iVar.f116955x.getItem(i3));
                    iVar.f116954w.f116859b = false;
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean mo1547g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo1548h(C0460an anVar) {
        return false;
    }

    /* renamed from: i */
    public final boolean mo1521i(C0480t tVar) {
        return false;
    }

    /* renamed from: j */
    public final boolean mo1522j(C0480t tVar) {
        return false;
    }

    /* renamed from: n */
    public final void mo1549n(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            C44822i iVar = this.f116858a;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.f116862a;
            int size = iVar.f116955x.f1652c.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = iVar.f116955x.getItem(i2);
                if (i == item.getItemId()) {
                    iVar.f116936e = i;
                    iVar.f116937f = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.f116858a.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f116863b;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            int i3 = 0;
            while (i3 < parcelableSparseArray.size()) {
                int keyAt = parcelableSparseArray.keyAt(i3);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i3);
                if (state != null) {
                    sparseArray.put(keyAt, new C44536a(context, state));
                    i3++;
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            C44822i iVar2 = this.f116858a;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int keyAt2 = sparseArray.keyAt(i4);
                if (iVar2.f116944m.indexOfKey(keyAt2) < 0) {
                    iVar2.f116944m.append(keyAt2, (C44536a) sparseArray.get(keyAt2));
                }
            }
            C44819f[] fVarArr = iVar2.f116935d;
            if (fVarArr != null) {
                for (C44819f fVar : fVarArr) {
                    fVar.mo48212n((C44536a) iVar2.f116944m.get(fVar.getId()));
                }
            }
        }
    }
}
