package com.google.android.apps.gsa.staticplugins.nga.p8092ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82373cu;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82603lh;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82604li;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C103964cj;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C103966cl;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C103967cm;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C104026er;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.android.material.p3505b.C44534d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.o */
/* compiled from: PG */
public final class C104163o extends C83907bm implements C103966cl {

    /* renamed from: b */
    public static final C58974d f289726b = C58974d.m91136j();

    /* renamed from: c */
    public Context f289727c;

    /* renamed from: d */
    public SharedPreferences f289728d;

    /* renamed from: e */
    public C86124t f289729e;

    /* renamed from: f */
    public C104026er f289730f;

    /* renamed from: g */
    public C22871g f289731g;

    /* renamed from: h */
    public C103967cm f289732h;

    /* renamed from: i */
    public C103964cj f289733i;

    /* renamed from: j */
    public C83305i f289734j;

    /* renamed from: k */
    public OpaPageLayout f289735k;

    /* renamed from: l */
    public C104149a f289736l;

    /* renamed from: m */
    private int f289737m = 1;

    /* renamed from: h */
    private final void m172129h(OpaPageLayout opaPageLayout) {
        Activity activity;
        if (this.f289736l.mo93971b() && C44534d.m78715b() && (activity = getActivity()) != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, 2132150627);
            ImageView imageView = (ImageView) opaPageLayout.findViewById(R.id.nga_data_update_required_logo);
            if (imageView != null) {
                imageView.setImageTintList(ColorStateList.valueOf(C19391a.m36980a(contextThemeWrapper, R.attr.colorOnBackground)));
            }
            MaterialProgressBar materialProgressBar = (MaterialProgressBar) opaPageLayout.findViewById(R.id.nga_data_update_progress_bar);
            if (materialProgressBar != null) {
                materialProgressBar.mo34163f(C19391a.m36980a(contextThemeWrapper, R.attr.colorPrimary));
            }
        }
    }

    /* renamed from: i */
    private final void m172130i(FooterLayout footerLayout) {
        footerLayout.mo77362c(4);
        footerLayout.mo77361b().setText(R.string.nga_data_update_in_progress_cancel_button);
        footerLayout.mo77361b().setOnClickListener(new C104162n(this));
    }

    /* renamed from: j */
    private static final int m172131j(Context context, View view) {
        return Math.round(((float) view.getHeight()) / (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    /* renamed from: a */
    public final void mo93907a(int i, long j, long j2) {
        this.f289731g.mo28212l("[NGA] NgaDataUpdateFragment.onDownloadStateChange", new C104158j(this, i, j, j2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: c */
    public final void mo77315c() {
        this.f289728d.edit().remove(C90507o.f253033w).apply();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = (OpaPageLayout) View.inflate(getActivity(), R.layout.nga_data_update_required, (ViewGroup) null);
        this.f289735k = opaPageLayout;
        m172129h(opaPageLayout);
        mo93979g(2, 0, 0);
        ((C103967cm) this.f289730f.f289459m.mo27525b()).mo93908a();
        this.f289732h.mo93911d(this);
        this.f289733i.mo93905f();
        return this.f289735k;
    }

    public final void onDestroyView() {
        this.f289732h.mo93912e(this);
        super.onDestroyView();
    }

    /* renamed from: e */
    public final void mo93978e(FooterLayout footerLayout, boolean z) {
        Context context;
        int i = this.f289737m;
        if (i == 0) {
            throw null;
        } else if ((i == 2 || i == 6) && (context = getContext()) != null) {
            int j = m172131j(context, footerLayout.mo77361b());
            int j2 = m172131j(context, footerLayout.mo77360a());
            if (j < 15 || j2 < 15) {
                if (!z && this.f289729e.mo79746e(C90126fx.f251272fg)) {
                    View view = getView();
                    if (view != null) {
                        view.requestLayout();
                        view.invalidate();
                    }
                    Activity activity = getActivity();
                    if (activity != null) {
                        activity.getFragmentManager().beginTransaction().detach(this).attach(this).commit();
                    }
                    this.f289731g.mo28213m("[NGA] measure drawn height", 100, new C104157i(this, footerLayout));
                }
                ((C58970a) ((C58970a) f289726b.mo56226d()).mo56372aa(21817)).mo56393w("Cancel button height = %d; download button height = %d", j, j2);
            } else {
                ((C58970a) ((C58970a) f289726b.mo56224b()).mo56372aa(21818)).mo56393w("Cancel button height = %d; download button height = %d", j, j2);
            }
            C83305i iVar = this.f289734j;
            C82603lh g = C82604li.m131700g();
            C82373cu cuVar = (C82373cu) g;
            cuVar.f225040c = "CANCEL";
            cuVar.f225039b = Double.valueOf((double) j);
            g.mo75915b(z);
            iVar.mo75579d(g.mo75914a());
            C83305i iVar2 = this.f289734j;
            C82603lh g2 = C82604li.m131700g();
            C82373cu cuVar2 = (C82373cu) g2;
            cuVar2.f225040c = "DOWNLOAD";
            cuVar2.f225039b = Double.valueOf((double) j2);
            g2.mo75915b(z);
            iVar2.mo75579d(g2.mo75914a());
        }
    }

    /* renamed from: g */
    public final void mo93979g(int i, long j, long j2) {
        int i2 = i;
        long j3 = j;
        long j4 = j2;
        int i3 = this.f289737m;
        if (i3 != 0) {
            int i4 = 0;
            if (i3 != i2) {
                int i5 = R.layout.nga_update_in_progress_content;
                if (i2 != 4) {
                    if (i2 == 3) {
                        i2 = 3;
                    } else {
                        i5 = R.layout.nga_data_update_required_content;
                    }
                }
                int i6 = 76426;
                if (i2 != 4) {
                    if (i2 == 3) {
                        i2 = 3;
                    } else {
                        i6 = 76425;
                    }
                }
                this.f289735k.mo77370b(i5);
                m172129h(this.f289735k);
                C28295m.m52919e(this.f289735k, new C28292j(i6));
                this.f289737m = i2;
                if (i2 == 4) {
                    m172130i(this.f289735k.f228726a);
                    MaterialProgressBar materialProgressBar = (MaterialProgressBar) this.f289735k.findViewById(R.id.nga_data_update_progress_bar);
                    materialProgressBar.setIndeterminate(false);
                    materialProgressBar.setMax(100);
                } else if (i2 == 3) {
                    m172130i(this.f289735k.f228726a);
                    ((MaterialProgressBar) this.f289735k.findViewById(R.id.nga_data_update_progress_bar)).setIndeterminate(true);
                } else {
                    FooterLayout footerLayout = this.f289735k.f228726a;
                    footerLayout.mo77362c(2);
                    footerLayout.mo77360a().setText(R.string.nga_data_update_required_download_button);
                    footerLayout.mo77361b().setText(R.string.nga_data_update_required_cancel_button);
                    footerLayout.mo77360a().setOnClickListener(new C89943l(new C104159k(this)));
                    footerLayout.mo77361b().setOnClickListener(new C104160l(this));
                    this.f289731g.mo28213m("[NGA] measure drawn height", 100, new C104161m(this, footerLayout));
                }
            }
            if (!(i2 == 4 || i2 == 3)) {
                TextView textView = (TextView) this.f289735k.findViewById(R.id.nga_data_update_required_message_text_view_id);
                int i7 = i2 - 1;
                if (i7 != 1) {
                    if (i7 == 5) {
                        textView.setText(R.string.nga_data_update_error_message);
                    }
                } else if (j3 == 0) {
                    textView.setText(R.string.nga_data_update_required_message);
                } else {
                    textView.setText(this.f289727c.getString(R.string.nga_data_update_required_with_size_message, new Object[]{Double.valueOf(Math.ceil((double) (Math.max(((float) (j3 - j4)) / 1048576.0f, 0.1f) * 100.0f)) / 100.0d)}));
                }
            }
            if (i2 == 4) {
                MaterialProgressBar materialProgressBar2 = (MaterialProgressBar) this.f289735k.findViewById(R.id.nga_data_update_progress_bar);
                if (j3 != 0) {
                    i4 = (int) ((((float) j4) * 100.0f) / ((float) j3));
                }
                materialProgressBar2.setProgress(i4);
                return;
            }
            return;
        }
        throw null;
    }
}
