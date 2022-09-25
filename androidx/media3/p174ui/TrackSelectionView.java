package androidx.media3.p174ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.ui.TrackSelectionView */
/* compiled from: PG */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a */
    public final CheckedTextView f11683a;

    /* renamed from: b */
    public final CheckedTextView f11684b;

    /* renamed from: c */
    public final List f11685c;

    /* renamed from: d */
    public final Map f11686d;

    /* renamed from: e */
    public boolean f11687e;

    /* renamed from: f */
    private final int f11688f;

    /* renamed from: g */
    private final LayoutInflater f11689g;

    /* renamed from: h */
    private final C3661y f11690h;

    public TrackSelectionView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f11688f = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f11689g = from;
        C3661y yVar = new C3661y(this);
        this.f11690h = yVar;
        getResources().getClass();
        this.f11685c = new ArrayList();
        this.f11686d = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.f11683a = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(yVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.exo_list_divider, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.f11684b = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(yVar);
        addView(checkedTextView2);
    }
}
