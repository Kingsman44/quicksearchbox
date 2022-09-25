package android.support.p033v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p033v7.app.C0388i;
import android.support.p033v7.app.C0391l;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;

/* renamed from: android.support.v7.view.menu.m */
/* compiled from: PG */
public final class C0473m implements AdapterView.OnItemClickListener, C0452af {

    /* renamed from: a */
    Context f1637a;

    /* renamed from: b */
    public LayoutInflater f1638b;

    /* renamed from: c */
    C0477q f1639c;

    /* renamed from: d */
    public ExpandedMenuView f1640d;

    /* renamed from: e */
    public C0451ae f1641e;

    /* renamed from: f */
    public C0472l f1642f;

    public C0473m(Context context) {
        this.f1637a = context;
        this.f1638b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public final int mo1519a() {
        return 0;
    }

    /* renamed from: c */
    public final void mo1520c(Context context, C0477q qVar) {
        if (this.f1637a != null) {
            this.f1637a = context;
            if (this.f1638b == null) {
                this.f1638b = LayoutInflater.from(context);
            }
        }
        this.f1639c = qVar;
        C0472l lVar = this.f1642f;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public final void mo1543d(C0477q qVar, boolean z) {
        C0451ae aeVar = this.f1641e;
        if (aeVar != null) {
            aeVar.mo1121a(qVar, z);
        }
    }

    /* renamed from: e */
    public final void mo1544e(C0451ae aeVar) {
        throw null;
    }

    /* renamed from: eI */
    public final Parcelable mo1545eI() {
        if (this.f1640d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f1640d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    /* renamed from: f */
    public final void mo1546f(boolean z) {
        C0472l lVar = this.f1642f;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public final boolean mo1547g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo1548h(C0460an anVar) {
        if (!anVar.hasVisibleItems()) {
            return false;
        }
        C0478r rVar = new C0478r(anVar);
        C0477q qVar = rVar.f1675a;
        C0391l lVar = new C0391l(qVar.f1650a);
        rVar.f1677c = new C0473m(lVar.getContext());
        C0473m mVar = rVar.f1677c;
        mVar.f1641e = rVar;
        C0477q qVar2 = rVar.f1675a;
        qVar2.mo1655f(mVar, qVar2.f1650a);
        ListAdapter k = rVar.f1677c.mo1629k();
        C0388i iVar = lVar.f1347a;
        iVar.f1338s = k;
        iVar.f1339t = rVar;
        View view = qVar.f1658i;
        if (view != null) {
            iVar.f1325f = view;
        } else {
            iVar.f1323d = qVar.f1657h;
            lVar.setTitle(qVar.f1656g);
        }
        lVar.f1347a.f1336q = rVar;
        rVar.f1676b = lVar.create();
        rVar.f1676b.setOnDismissListener(rVar);
        WindowManager.LayoutParams attributes = rVar.f1676b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= C89885b.S3REQUEST_VALUE;
        rVar.f1676b.show();
        C0451ae aeVar = this.f1641e;
        if (aeVar == null) {
            return true;
        }
        aeVar.mo1122b(anVar);
        return true;
    }

    /* renamed from: i */
    public final boolean mo1521i(C0480t tVar) {
        return false;
    }

    /* renamed from: j */
    public final boolean mo1522j(C0480t tVar) {
        return false;
    }

    /* renamed from: k */
    public final ListAdapter mo1629k() {
        if (this.f1642f == null) {
            this.f1642f = new C0472l(this);
        }
        return this.f1642f;
    }

    /* renamed from: n */
    public final void mo1549n(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1640d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f1639c.mo1680z(this.f1642f.getItem(i), this, 0);
    }
}
