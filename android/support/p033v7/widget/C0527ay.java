package android.support.p033v7.widget;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: android.support.v7.widget.ay */
/* compiled from: PG */
final class C0527ay implements ListAdapter, SpinnerAdapter {

    /* renamed from: a */
    private final SpinnerAdapter f2086a;

    /* renamed from: b */
    private ListAdapter f2087b;

    public C0527ay(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.f2086a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f2087b = (ListAdapter) spinnerAdapter;
        }
        if (theme == null) {
            return;
        }
        if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
            C0525aw.m1930a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        } else if (spinnerAdapter instanceof C0731il) {
            C0731il ilVar = (C0731il) spinnerAdapter;
            if (ilVar.mo3239a() == null) {
                ilVar.mo3240b();
            }
        }
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f2087b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f2086a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f2086a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    public final Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.f2086a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    public final long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.f2086a;
        if (spinnerAdapter == null) {
            return -1;
        }
        return spinnerAdapter.getItemId(i);
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f2086a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f2087b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f2086a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f2086a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
