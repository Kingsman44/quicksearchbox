package androidx.media3.p174ui;

import android.view.View;
import android.widget.CheckedTextView;

/* renamed from: androidx.media3.ui.y */
/* compiled from: PG */
final class C3661y implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TrackSelectionView f11790a;

    public C3661y(TrackSelectionView trackSelectionView) {
        this.f11790a = trackSelectionView;
    }

    public final void onClick(View view) {
        TrackSelectionView trackSelectionView = this.f11790a;
        boolean z = true;
        if (view == trackSelectionView.f11683a) {
            trackSelectionView.f11687e = true;
            trackSelectionView.f11686d.clear();
        } else if (view == trackSelectionView.f11684b) {
            trackSelectionView.f11687e = false;
            trackSelectionView.f11686d.clear();
        } else {
            trackSelectionView.f11687e = false;
            Object tag = view.getTag();
            if (tag == null) {
                throw null;
            }
            C3662z zVar = (C3662z) tag;
            throw null;
        }
        trackSelectionView.f11683a.setChecked(trackSelectionView.f11687e);
        CheckedTextView checkedTextView = trackSelectionView.f11684b;
        if (trackSelectionView.f11687e || trackSelectionView.f11686d.size() != 0) {
            z = false;
        }
        checkedTextView.setChecked(z);
        throw null;
    }
}
