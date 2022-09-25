package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.content.Context;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import p3186j$.util.Collection;

/* compiled from: PG */
public final class DownloadStateImageView extends AppCompatImageView {

    /* renamed from: b */
    public static final /* synthetic */ int f70998b = 0;

    /* renamed from: c */
    private static final C58495hd f70999c;

    /* renamed from: a */
    public C25327c f71000a = C25327c.UNKNOWN;

    static {
        C25327c cVar = C25327c.DOWNLOADABLE;
        Integer valueOf = Integer.valueOf(R.attr.state_downloadable);
        C25327c cVar2 = C25327c.QUEUED;
        Integer valueOf2 = Integer.valueOf(R.attr.state_queued);
        f70999c = C58495hd.m89907u(cVar, valueOf, cVar2, valueOf2, C25327c.BACKGROUND_QUEUED, valueOf2, C25327c.DOWNLOADING, Integer.valueOf(R.attr.state_downloading), C25327c.DOWNLOADED, Integer.valueOf(R.attr.state_downloaded), C25327c.PERMANENT, Integer.valueOf(R.attr.state_permanent), C25327c.FAILED, Integer.valueOf(R.attr.state_failed), C25327c.UNKNOWN, Integer.valueOf(R.attr.state_unknown));
    }

    public DownloadStateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int[] onCreateDrawableState(int i) {
        C58495hd hdVar = f70999c;
        return mergeDrawableStates(super.onCreateDrawableState(i + ((C58729pv) hdVar).f156487c), Collection.EL.stream(hdVar.values()).mapToInt(new C26185l(((Integer) hdVar.getOrDefault(this.f71000a, Integer.valueOf(R.attr.state_unknown))).intValue())).toArray());
    }
}
