package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
/* compiled from: PG */
public abstract class C4268a {

    /* renamed from: a */
    public final DataSetObservable f13843a = new DataSetObservable();

    /* renamed from: b */
    public DataSetObserver f13844b;

    /* renamed from: d */
    public void mo646d(ViewGroup viewGroup, int i, Object obj) {
        throw null;
    }

    /* renamed from: g */
    public void mo647g(ViewGroup viewGroup, int i, Object obj) {
    }

    /* renamed from: gv */
    public Parcelable mo648gv() {
        return null;
    }

    /* renamed from: gw */
    public Object mo649gw(ViewGroup viewGroup, int i) {
        throw null;
    }

    /* renamed from: gx */
    public void mo650gx(ViewGroup viewGroup) {
    }

    /* renamed from: h */
    public void mo651h(ViewGroup viewGroup) {
    }

    /* renamed from: i */
    public abstract boolean mo652i(View view, Object obj);

    /* renamed from: j */
    public float mo9174j(int i) {
        return 1.0f;
    }

    /* renamed from: jT */
    public void mo653jT(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: k */
    public abstract int mo9175k();

    /* renamed from: l */
    public int mo9176l(Object obj) {
        return -1;
    }

    /* renamed from: m */
    public CharSequence mo9177m(int i) {
        return null;
    }

    /* renamed from: n */
    public void mo9178n() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f13844b;
            if (dataSetObserver != null) {
                ((C4279l) dataSetObserver).f13860a.mo9138g();
            }
        }
        this.f13843a.notifyChanged();
    }
}
