package android.support.p033v7.widget;

import android.database.Observable;

/* renamed from: android.support.v7.widget.fc */
/* compiled from: PG */
public final class C0641fc extends Observable {
    /* renamed from: a */
    public final void mo2879a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C0642fd) this.mObservers.get(size)).mo2831a();
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo2880b(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C0642fd) this.mObservers.get(size)).mo2837g(i, i2);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo2881c(int i, int i2, Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C0642fd) this.mObservers.get(size)).mo2833c(i, i2, obj);
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo2882d(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C0642fd) this.mObservers.get(size)).mo2834d(i, i2);
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final void mo2883e(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C0642fd) this.mObservers.get(size)).mo2835e(i, i2);
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo2884f() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C0642fd) this.mObservers.get(size)).mo2836f();
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo2885g() {
        return !this.mObservers.isEmpty();
    }
}
