package androidx.p106e.p107a;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: androidx.e.a.c */
/* compiled from: PG */
public abstract class C2186c extends BaseAdapter implements Filterable, C2187d {

    /* renamed from: a */
    private C2188e f6200a;

    /* renamed from: b */
    public boolean f6201b = false;

    /* renamed from: c */
    public final boolean f6202c = true;

    /* renamed from: d */
    public Cursor f6203d = null;

    /* renamed from: e */
    public int f6204e = -1;

    /* renamed from: f */
    public final C2184a f6205f = new C2184a(this);

    /* renamed from: g */
    public final DataSetObserver f6206g = new C2185b(this);

    /* renamed from: a */
    public Cursor mo3226a(CharSequence charSequence) {
        throw null;
    }

    /* renamed from: b */
    public CharSequence mo3227b(Cursor cursor) {
        throw null;
    }

    /* renamed from: d */
    public void mo3228d(Cursor cursor) {
        throw null;
    }

    /* renamed from: e */
    public abstract void mo3229e(View view, Cursor cursor);

    /* renamed from: f */
    public abstract View mo3230f(ViewGroup viewGroup);

    /* renamed from: g */
    public final Cursor mo5501g() {
        return this.f6203d;
    }

    public final int getCount() {
        Cursor cursor;
        if (!this.f6201b || (cursor = this.f6203d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Cursor cursor;
        if (!this.f6201b || (cursor = this.f6203d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        if (view == null) {
            view = mo5506h(viewGroup);
        }
        mo3229e(view, this.f6203d);
        return view;
    }

    public final Filter getFilter() {
        if (this.f6200a == null) {
            this.f6200a = new C2188e(this);
        }
        return this.f6200a;
    }

    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f6201b || (cursor = this.f6203d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f6203d;
    }

    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.f6201b || (cursor = this.f6203d) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f6203d.getLong(this.f6204e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f6201b) {
            Cursor cursor = this.f6203d;
            if (cursor == null) {
                throw new IllegalStateException("this should only be called when the cursor is non-null");
            } else if (cursor.moveToPosition(i)) {
                if (view == null) {
                    view = mo3230f(viewGroup);
                }
                mo3229e(view, this.f6203d);
                return view;
            } else {
                throw new IllegalStateException("couldn't move cursor to position " + i);
            }
        } else {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
    }

    /* renamed from: h */
    public View mo5506h(ViewGroup viewGroup) {
        throw null;
    }

    public boolean hasStableIds() {
        return true;
    }
}
