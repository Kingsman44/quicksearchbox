package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.LauncherApps;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.apps.search.googleapp.p10139b.C133488d;
import com.google.android.apps.search.googleapp.pixelsuggest.C136895e;
import com.google.android.apps.search.googleapp.pixelsuggest.C136896f;
import com.google.android.apps.search.googleapp.search.suggest.C138015ag;
import com.google.android.apps.search.googleapp.search.suggest.C138022an;
import com.google.android.apps.search.googleapp.search.suggest.C138024ap;
import com.google.android.apps.search.googleapp.search.suggest.C138025aq;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.c */
/* compiled from: PG */
public final class C138650c extends C46756m {

    /* renamed from: b */
    private static final C58974d f377104b = C58974d.m91136j();

    /* renamed from: a */
    public final Context f377105a;

    /* renamed from: c */
    private final C47770dh f377106c;

    /* renamed from: d */
    private final C47400m f377107d;

    /* renamed from: e */
    private final C47449e f377108e;

    /* renamed from: f */
    private final C136895e f377109f;

    /* renamed from: g */
    private final boolean f377110g;

    /* renamed from: h */
    private final boolean f377111h;

    public C138650c(Context context, C47770dh dhVar, C47400m mVar, C47449e eVar, C136895e eVar2, boolean z, boolean z2) {
        this.f377105a = context;
        this.f377106c = dhVar;
        this.f377107d = mVar;
        this.f377108e = eVar;
        this.f377109f = eVar2;
        this.f377110g = z;
        this.f377111h = z2;
    }

    /* renamed from: d */
    static String m225194d(C138030av avVar) {
        try {
            C138025aq aqVar = avVar.f375548l;
            if (aqVar == null) {
                aqVar = C138025aq.f375512e;
            }
            return C138631aj.m225132b(aqVar).getPackage();
        } catch (URISyntaxException e) {
            ((C58970a) ((C58970a) ((C58970a) f377104b.mo56225c()).mo56382g(e)).mo56372aa(41278)).mo56389s("Unable to parse the Intent URI for the clicked suggestion: %s", avVar.f375539b);
            return null;
        }
    }

    /* renamed from: e */
    private static void m225195e(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_app_strip, viewGroup, false);
        if (this.f377111h) {
            inflate.setPaddingRelative(inflate.getPaddingStart(), inflate.getResources().getDimensionPixelOffset(R.dimen.googleapp_app_strip_without_header_padding_top), inflate.getPaddingEnd(), inflate.getPaddingBottom());
        }
        return inflate;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18114b(View view, Object obj) {
        Uri uri;
        Drawable drawable;
        UserHandle userHandle;
        LauncherApps launcherApps;
        C138015ag agVar = (C138015ag) obj;
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i);
            if (i < agVar.f375483c.size()) {
                C138030av avVar = (C138030av) agVar.f375483c.get(i);
                C138029au a = C138029au.m224331a(avVar.f375541d);
                if (a == null) {
                    a = C138029au.QUERY;
                }
                C58838bb.m90868c(a == C138029au.ON_DEVICE_APP);
                viewGroup2.setVisibility(0);
                ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.googleapp_app_icon);
                TextView textView = (TextView) viewGroup2.findViewById(R.id.googleapp_app_name);
                if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_WORK_PROFILE_APP)) {
                    if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_WORK_PROFILE_APP)) {
                        UserManager userManager = (UserManager) this.f377105a.getSystemService("user");
                        if (userManager == null || userManager.getUserProfiles().size() != 2) {
                            launcherApps = null;
                            userHandle = null;
                        } else {
                            launcherApps = null;
                            userHandle = null;
                            for (UserHandle next : userManager.getUserProfiles()) {
                                if (!next.equals(Process.myUserHandle())) {
                                    launcherApps = (LauncherApps) this.f377105a.getSystemService(LauncherApps.class);
                                    userHandle = next;
                                }
                            }
                        }
                        if (launcherApps == null || userHandle == null) {
                            C59081b.m91349a(C38505d.f101864b, "metadata key");
                            String str = avVar.f375539b;
                        } else {
                            String d = m225194d(avVar);
                            if (d == null) {
                                C59081b.m91349a(C38505d.f101864b, "metadata key");
                                String str2 = avVar.f375539b;
                            } else {
                                List<LauncherActivityInfo> activityList = launcherApps.getActivityList(d, userHandle);
                                if (activityList.isEmpty()) {
                                    C59081b.m91349a(C38505d.f101864b, "metadata key");
                                    String str3 = avVar.f375539b;
                                }
                                if (!activityList.isEmpty()) {
                                    drawable = activityList.get(0).getBadgedIcon(0);
                                    C6007z g = this.f377108e.mo51286a().mo11869g(drawable);
                                    g.mo12455s(new C138648b(imageView), (C5592i) null, g, C5622i.f16959a);
                                }
                            }
                        }
                    }
                    drawable = null;
                    C6007z g2 = this.f377108e.mo51286a().mo11869g(drawable);
                    g2.mo12455s(new C138648b(imageView), (C5592i) null, g2, C5622i.f16959a);
                } else if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_ZERO_PREFIX_ICING)) {
                    C138025aq aqVar = avVar.f375548l;
                    if (aqVar == null) {
                        aqVar = C138025aq.f375512e;
                    }
                    C138022an anVar = aqVar.f375516c;
                    if (anVar == null) {
                        anVar = C138022an.f375501e;
                    }
                    List<LauncherActivityInfo> activityList2 = ((LauncherApps) this.f377105a.getSystemService(LauncherApps.class)).getActivityList(anVar.f375506d, Process.myUserHandle());
                    Drawable icon = activityList2.size() == 1 ? activityList2.get(0).getIcon(0) : null;
                    if (icon != null) {
                        C6007z g3 = this.f377108e.mo51286a().mo11869g(icon);
                        g3.mo12455s(new C138648b(imageView), (C5592i) null, g3, C5622i.f16959a);
                    }
                } else {
                    C138025aq aqVar2 = avVar.f375548l;
                    if (aqVar2 == null) {
                        aqVar2 = C138025aq.f375512e;
                    }
                    int i2 = aqVar2.f375514a;
                    if ((i2 & 2) != 0) {
                        C138022an anVar2 = aqVar2.f375516c;
                        if (anVar2 == null) {
                            anVar2 = C138022an.f375501e;
                        }
                        uri = Uri.parse(anVar2.f375504b);
                    } else if ((i2 & 4) != 0) {
                        C138024ap apVar = aqVar2.f375517d;
                        if (apVar == null) {
                            apVar = C138024ap.f375507d;
                        }
                        uri = Uri.parse(apVar.f375510b);
                    } else {
                        uri = null;
                    }
                    if (uri != null) {
                        C6007z h = this.f377108e.mo51286a().mo11870h(uri);
                        h.mo12455s(new C138648b(imageView), (C5592i) null, h, C5622i.f16959a);
                    }
                }
                textView.setText(avVar.f375539b);
                this.f377107d.mo51252a(viewGroup2, C138631aj.m225133c(avVar, getClass().getSimpleName()));
                C133488d.m216677b(viewGroup2, C133488d.m216676a(this.f377106c, new C138621a(this, avVar, viewGroup2), "Long-clicked suggestion"));
                viewGroup2.setContentDescription(this.f377105a.getResources().getString(true != new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_WORK_PROFILE_APP) ? R.string.ga_on_device_app_suggestion_content_description : R.string.googleapp_ga_on_device_app_suggestion_from_work_profile_content_description, new Object[]{avVar.f375539b}));
            } else {
                viewGroup2.setVisibility(4);
            }
        }
        C138034az a2 = C138034az.m224336a(((C138030av) agVar.f375483c.get(0)).f375545i);
        if (a2 == null) {
            a2 = C138034az.NONE;
        }
        C138034az azVar = C138034az.PIXEL_LAUNCHER;
        C136896f fVar = this.f377109f.f372594a;
        if (a2 == azVar && fVar != null) {
            m225195e(viewGroup, fVar.f372597a);
        } else if (!this.f377110g || !new C62963cj(((C138030av) agVar.f375483c.get(0)).f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_ZERO_PREFIX_ICING)) {
            m225195e(viewGroup, -2);
        } else {
            m225195e(viewGroup, 1);
        }
    }
}
