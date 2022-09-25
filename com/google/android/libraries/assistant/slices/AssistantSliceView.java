package com.google.android.libraries.assistant.slices;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.slice.C4110i;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.widget.SliceView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Arrays;

/* compiled from: PG */
public class AssistantSliceView extends SliceView {

    /* renamed from: r */
    private static final C59071e f53825r = C59071e.m91332i("com.google.android.libraries.assistant.slices.AssistantSliceView");

    /* renamed from: p */
    public final Context f53826p;

    /* renamed from: q */
    public int f53827q;

    /* renamed from: s */
    private Slice f53828s;

    public AssistantSliceView(Context context) {
        super(context);
        this.f53826p = context;
        mo8668c(new C19233i(context));
    }

    /* renamed from: j */
    private final void m36594j() {
        SliceItem sliceItem;
        if (getParent() != null) {
            LinearLayout linearLayout = (LinearLayout) getParent();
            if (linearLayout.getId() == R.id.assistant_slice_view_container) {
                ImageView imageView = (ImageView) linearLayout.findViewById(R.id.assistant_slice_view_header_appicon);
                TextView textView = (TextView) linearLayout.findViewById(R.id.assistant_slice_view_header_appname);
                if (imageView != null && textView != null && this.f53828s != null) {
                    PackageManager packageManager = this.f53826p.getPackageManager();
                    ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(Uri.parse(this.f53828s.f13090f).getAuthority(), 0);
                    imageView.setImageDrawable(packageManager.getApplicationIcon(resolveContentProvider.applicationInfo));
                    textView.setText((String) packageManager.getApplicationLabel(resolveContentProvider.applicationInfo));
                    TextView textView2 = (TextView) ((LinearLayout) getParent()).findViewById(R.id.assistant_slice_view_header_title);
                    if (Arrays.asList(this.f53828s.f13088d).size() >= 3 && textView2 != null) {
                        Bundle bundle = new C4110i(this.f53826p, this.f53828s).f13139e;
                        if (bundle.getString("assistantTts") == null || bundle.getString("assistantTts").isEmpty()) {
                            sliceItem = (SliceItem) C58557jl.m90131l(Arrays.asList(this.f53828s.f13088d));
                        } else {
                            sliceItem = (SliceItem) Arrays.asList(this.f53828s.f13088d).get(Arrays.asList(this.f53828s.f13088d).size() - 2);
                        }
                        if (sliceItem.f13092b.equals("slice")) {
                            SliceItem sliceItem2 = (SliceItem) C58557jl.m90131l(Arrays.asList(sliceItem.mo8596d().f13088d));
                            if (sliceItem2.f13092b.equals("text")) {
                                String trim = ((CharSequence) sliceItem2.f13094d).toString().trim();
                                if (!trim.isEmpty()) {
                                    textView2.setText(String.valueOf(this.f53826p.getResources().getString(R.string.slice_header_delimiter)).concat(String.valueOf(trim)));
                                }
                            }
                        }
                    }
                    ((LinearLayout) linearLayout.findViewById(R.id.assistant_slice_view_header)).setOnClickListener(new C19232h(this, packageManager, resolveContentProvider));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo8667b(Slice slice) {
        mo8671f(slice);
    }

    /* renamed from: hX */
    public final /* synthetic */ void mo774hX(Object obj) {
        mo8671f((Slice) obj);
    }

    public AssistantSliceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53826p = context;
        mo8668c(new C19233i(context));
    }

    public AssistantSliceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53826p = context;
        mo8668c(new C19233i(context));
    }

    /* renamed from: f */
    public final void mo8671f(Slice slice) {
        this.f53828s = slice;
        try {
            int i = this.f53827q;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    mo8673h(2);
                    mo8670e(false);
                    mo8674i();
                    m36594j();
                } else if (i2 == 1) {
                    mo8673h(2);
                    mo8670e(true);
                    mo8674i();
                    m36594j();
                }
                super.mo8671f(this.f53828s);
                LinearLayout linearLayout = (LinearLayout) getParent();
                if (linearLayout.getId() == R.id.assistant_slice_view_container) {
                    linearLayout.setVisibility(0);
                    return;
                }
                return;
            }
            throw null;
        } catch (IllegalStateException unused) {
            ((C59052c) ((C59052c) f53825r.mo56225c()).mo56372aa(47546)).mo56386p("Slice does not contain the required components.");
            super.mo8671f((Slice) null);
        }
    }
}
