package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.p091b.C1875x;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: U */
    public final boolean mo8354U() {
        return false;
    }

    /* renamed from: a */
    public void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        C4027w.m11542a(axVar.itemView, true);
    }

    /* renamed from: k */
    public final boolean mo8324k() {
        return !super.mo8354U();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1875x.m5115b(context, R.attr.preferenceCategoryStyle, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
