package com.google.android.apps.gsa.staticplugins.recently.monet.shared;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8686a.C116100aa;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8686a.C116102ac;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8686a.C116127z;
import com.google.android.apps.gsa.staticplugins.recently.p8682e.C116075c;
import com.google.android.apps.gsa.staticplugins.recently.p8683f.C116081b;
import com.google.android.apps.gsa.staticplugins.recently.p8683f.C116082c;
import com.google.android.apps.gsa.staticplugins.recently.p8683f.C116084e;
import com.google.android.apps.gsa.staticplugins.recently.p8683f.C116087h;
import com.google.android.apps.gsa.staticplugins.recently.timeline.C116199b;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Group;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23073ad;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.p1875j.C22840k;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.shared.d */
/* compiled from: PG */
public final class C116131d implements C23113i {

    /* renamed from: a */
    private final C116129b f322042a;

    public C116131d(C116129b bVar) {
        this.f322042a = bVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        boolean z;
        String str3 = str;
        Parcelable parcelable2 = parcelable;
        if ("RecentlyEventsDispatcher".equals(str2) && (parcelable2 instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable2);
            int i = 0;
            if (str3.equals("onCctAccountMismatchCardClicked")) {
                C116102ac acVar = ((C116100aa) this.f322042a).f321942m;
                Intent intent = new Intent("android.intent.action.MAIN");
                C58485gu guVar = C90721ae.f253800i;
                int i2 = ((C58724pq) guVar).f156474d;
                int i3 = 0;
                while (i3 < i2) {
                    String str4 = (String) guVar.get(i3);
                    try {
                        acVar.f321970b.getPackageManager().getPackageInfo(str4, 0);
                        z = true;
                    } catch (PackageManager.NameNotFoundException unused) {
                        z = false;
                    }
                    i3++;
                    if (z) {
                        intent.setPackage(str4);
                        acVar.f321971c.mo65089a(intent);
                        return;
                    }
                }
                ((C59052c) ((C59052c) C116102ac.f321969a.mo56225c()).mo56372aa(30907)).mo56386p("No Chrome package on device");
            } else if (str3.equals("onEntryClicked_int_int")) {
                int intValue = Integer.valueOf(pVar.f63472a.getInt("groupIndex")).intValue();
                int intValue2 = Integer.valueOf(pVar.f63472a.getInt("entryIndex")).intValue();
                C116100aa aaVar = (C116100aa) this.f322042a;
                C58833ax axVar = (C58833ax) ((C23251a) aaVar.f321932c.mo102513l()).f63720e;
                if (axVar.mo56113h()) {
                    Timeline timeline = (Timeline) axVar.mo56107c();
                    if (timeline.f322178a[intValue].f322176g || intValue2 == 0) {
                        aaVar.mo102497n(2, intValue, intValue2);
                        aaVar.mo102494k(timeline.f322178a[intValue].f322177h[intValue2]);
                    } else {
                        aaVar.mo102498o(timeline, 3, intValue);
                        aaVar.f321937h.mo102459d(timeline.f322178a[intValue], true);
                    }
                    aaVar.mo102489e();
                }
            } else if (str3.equals("onEntrySwipedUp_int_int")) {
                int intValue3 = Integer.valueOf(pVar.f63472a.getInt("groupIndex")).intValue();
                int intValue4 = Integer.valueOf(pVar.f63472a.getInt("entryIndex")).intValue();
                C116100aa aaVar2 = (C116100aa) this.f322042a;
                C58833ax axVar2 = (C58833ax) ((C23251a) aaVar2.f321932c.mo102513l()).f63720e;
                if (axVar2.mo56113h()) {
                    Timeline timeline2 = (Timeline) axVar2.mo56107c();
                    C22845p pVar2 = timeline2.f322178a[intValue3].f322177h[intValue4];
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("KEY_SNACKBAR_DATA", new ProtoParcelable((C23073ad) new C116127z(pVar2)));
                    ((C23251a) aaVar2.f321932c.mo102512k()).mo28730f(C58833ax.m90834k(new SnackbarData(true, aaVar2.f321934e.getString(R.string.snackbar_message_removed_from_recently), aaVar2.f321934e.getString(R.string.snackbar_action_undo), "ACTION_ADD_ENTRY", "ACTION_REMOVE_ENTRY", bundle)), false);
                    C22845p pVar3 = timeline2.f322178a[intValue3].f322177h[intValue4];
                    if (Timeline.m192672c(pVar3)) {
                        aaVar2.mo102497n(3, intValue3, intValue4);
                    } else if (C116087h.m192468e(pVar3)) {
                        aaVar2.mo102497n(4, intValue3, intValue4);
                    }
                    if (Timeline.m192672c(pVar2)) {
                        C116075c cVar = aaVar2.f321937h;
                        cVar.mo102458c(pVar2);
                        cVar.mo102460e();
                    } else if (C116087h.m192468e(pVar2)) {
                        aaVar2.f321938i.mo102474d(new C116081b(pVar2));
                    }
                    aaVar2.mo102491h();
                }
            } else if (str3.equals("onExpandButtonClicked_int")) {
                int intValue5 = Integer.valueOf(pVar.f63472a.getInt("groupIndex")).intValue();
                C116100aa aaVar3 = (C116100aa) this.f322042a;
                C58833ax axVar3 = (C58833ax) ((C23251a) aaVar3.f321932c.mo102513l()).f63720e;
                if (axVar3.mo56113h()) {
                    Timeline timeline3 = (Timeline) axVar3.mo56107c();
                    aaVar3.f321937h.mo102459d(timeline3.f322178a[intValue5], true);
                    aaVar3.mo102498o(timeline3, 5, intValue5);
                }
            } else if (str3.equals("onGroupDetached_int")) {
                int intValue6 = Integer.valueOf(pVar.f63472a.getInt("groupIndex")).intValue();
                C116100aa aaVar4 = (C116100aa) this.f322042a;
                C58833ax axVar4 = (C58833ax) ((C23251a) aaVar4.f321932c.mo102513l()).f63720e;
                if (axVar4.mo56113h()) {
                    aaVar4.f321937h.mo102459d(((Timeline) axVar4.mo56107c()).f322178a[intValue6], false);
                }
            } else if (str3.equals("onGroupPinched_int_boolean")) {
                int intValue7 = Integer.valueOf(pVar.f63472a.getInt("groupIndex")).intValue();
                boolean booleanValue = Boolean.valueOf(pVar.f63472a.getBoolean("expanded")).booleanValue();
                C116100aa aaVar5 = (C116100aa) this.f322042a;
                C58833ax axVar5 = (C58833ax) ((C23251a) aaVar5.f321932c.mo102513l()).f63720e;
                if (axVar5.mo56113h()) {
                    aaVar5.f321937h.mo102459d(((Timeline) axVar5.mo56107c()).f322178a[intValue7], booleanValue);
                }
            } else if (str3.equals("onGroupSwipedUp_int")) {
                int intValue8 = Integer.valueOf(pVar.f63472a.getInt("groupIndex")).intValue();
                C116100aa aaVar6 = (C116100aa) this.f322042a;
                C58833ax axVar6 = (C58833ax) ((C23251a) aaVar6.f321932c.mo102513l()).f63720e;
                if (axVar6.mo56113h()) {
                    Timeline timeline4 = (Timeline) axVar6.mo56107c();
                    Group group = timeline4.f322178a[intValue8];
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("KEY_SNACKBAR_DATA", group);
                    ((C23251a) aaVar6.f321932c.mo102512k()).mo28730f(C58833ax.m90834k(new SnackbarData(true, aaVar6.f321934e.getString(R.string.snackbar_message_removed_from_recently), aaVar6.f321934e.getString(R.string.snackbar_action_undo), "ACTION_ADD_GROUP", "ACTION_REMOVE_GROUP", bundle2)), false);
                    aaVar6.mo102498o(timeline4, 4, intValue8);
                    if (C116087h.m192471h(group)) {
                        aaVar6.f321938i.mo102474d(new C116084e());
                    } else {
                        C116075c cVar2 = aaVar6.f321937h;
                        C116199b bVar = new C116199b(group);
                        boolean z2 = false;
                        while (bVar.hasNext()) {
                            C22845p a = bVar.next();
                            if (Timeline.m192672c(a)) {
                                cVar2.mo102458c(a);
                                z2 = true;
                            }
                        }
                        if (z2) {
                            cVar2.mo102460e();
                        }
                    }
                    int a2 = C22840k.m42693a(group.f322177h[0].f62894c);
                    if (a2 != 0 && a2 == 16) {
                        aaVar6.f321939j.mo78708l();
                    }
                    aaVar6.mo102491h();
                }
            } else if (str3.equals("onHelpMenuItemClicked")) {
                C116100aa aaVar7 = (C116100aa) this.f322042a;
                aaVar7.f321944o.mo86241e(aaVar7.f321934e, Uri.parse(aaVar7.f321935f.mo79758x(C90110fh.f250674bd)).buildUpon().appendQueryParameter("hl", Locale.getDefault().getLanguage()).build(), false, false);
            } else if (str3.equals("onJumpToGroupDone")) {
                ((C23251a) ((C116100aa) this.f322042a).f321932c.mo102506e()).mo28730f(-1, false);
            } else if (str3.equals("onMyActivityCardClicked_java.lang.String")) {
                String string = pVar.f63472a.getString("query");
                string.getClass();
                ((C116100aa) this.f322042a).mo102496m(string);
            } else {
                C22845p pVar4 = null;
                if (str3.equals("onMyActivityMenuItemClicked")) {
                    ((C116100aa) this.f322042a).mo102496m((String) null);
                } else if (str3.equals("onOnboardingMenuItemClicked")) {
                    C116100aa aaVar8 = (C116100aa) this.f322042a;
                    aaVar8.f321938i.mo102474d(new C116082c(System.currentTimeMillis()));
                    ((C23251a) aaVar8.f321932c.mo102509h()).mo28730f(0, false);
                    ((C23251a) aaVar8.f321932c.mo102509h()).mo28730f(-1, false);
                } else if (str3.equals("onQueryClicked_int")) {
                    int intValue9 = Integer.valueOf(pVar.f63472a.getInt("groupIndex")).intValue();
                    C116100aa aaVar9 = (C116100aa) this.f322042a;
                    C58833ax axVar7 = (C58833ax) ((C23251a) aaVar9.f321932c.mo102513l()).f63720e;
                    if (axVar7.mo56113h()) {
                        Timeline timeline5 = (Timeline) axVar7.mo56107c();
                        C22845p[] pVarArr = timeline5.f322178a[intValue9].f322177h;
                        int length = pVarArr.length;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            C22845p pVar5 = pVarArr[i];
                            if ((pVar5.f62892a & 64) != 0) {
                                pVar4 = pVar5;
                                break;
                            }
                            i++;
                        }
                        if (pVar4 != null) {
                            aaVar9.mo102494k(pVar4);
                        }
                        aaVar9.mo102489e();
                        aaVar9.mo102498o(timeline5, 2, intValue9);
                    }
                } else if (str3.equals("onRecentlyDisabledCardClicked")) {
                    ((C116100aa) this.f322042a).f321942m.mo102501d();
                } else if (str3.equals("onRemovedItemDialogDismissed")) {
                    C116100aa aaVar10 = (C116100aa) this.f322042a;
                    aaVar10.f321933d.edit().putBoolean("has_shown_remove_item_dialog", true).apply();
                    ((C23251a) aaVar10.f321932c.mo102504c()).mo28730f(C58833ax.m90834k(C116128a.NO_DIALOG), false);
                } else if (str3.equals("onRequestSaveState_com.google.common.base.Optional<android.os.Bundle>")) {
                    ((C23251a) ((C116100aa) this.f322042a).f321932c.mo102507f()).mo28730f(new C23268m(new C23269n()).mo28733b("stateBundleOptional", pVar), false);
                } else if (str3.equals("onSettingsMenuItemClicked")) {
                    ((C116100aa) this.f322042a).f321942m.mo102501d();
                } else if (str3.equals("onSignInDialogDismissed")) {
                    C116100aa aaVar11 = (C116100aa) this.f322042a;
                    aaVar11.f321943n.mo102514a();
                    ((C23251a) aaVar11.f321932c.mo102504c()).mo28730f(C58833ax.m90834k(C116128a.NO_DIALOG), false);
                } else if (str3.equals("onSnackbarActionClicked")) {
                    C116100aa aaVar12 = (C116100aa) this.f322042a;
                    C58833ax axVar8 = (C58833ax) ((C23251a) aaVar12.f321932c.mo102512k()).f63720e;
                    if (axVar8.mo56113h() && ((SnackbarData) axVar8.mo56107c()).f322030a) {
                        SnackbarData snackbarData = (SnackbarData) axVar8.mo56107c();
                        aaVar12.mo102490f(snackbarData.f322033d, snackbarData.f322035f);
                    }
                } else if (str3.equals("onSnackbarDismissed")) {
                    this.f322042a.mo102493j();
                }
            }
        }
    }
}
