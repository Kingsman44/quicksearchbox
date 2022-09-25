package com.google.android.libraries.logging.p2185ve;

import android.widget.CompoundButton;
import com.google.android.libraries.logging.p2185ve.p2188c.p2191c.C28342a;
import com.google.android.libraries.logging.p2185ve.p2188c.p2191c.C28343b;
import com.google.android.libraries.logging.p2185ve.p2188c.p2191c.C28344c;
import com.google.common.p4552o.p4566l.C60195df;
import com.google.common.p4552o.p4566l.C60198di;
import com.google.common.p4552o.p4566l.C60200dk;
import com.google.common.p4552o.p4566l.C60202dm;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.logging.ve.l */
/* compiled from: PG */
public final class C28442l {

    /* renamed from: a */
    public final C28445o f77225a;

    public C28442l(C28445o oVar) {
        this.f77225a = oVar;
    }

    /* renamed from: a */
    public static C28440j m53135a() {
        return new C28440j(2);
    }

    /* renamed from: b */
    public static C28440j m53136b() {
        return new C28440j(27);
    }

    /* renamed from: c */
    public static C28440j m53137c() {
        return new C28440j(4);
    }

    /* renamed from: d */
    public static C28440j m53138d() {
        return new C28440j(31);
    }

    /* renamed from: e */
    public static C28440j m53139e() {
        return new C28440j(32);
    }

    /* renamed from: f */
    public static C28440j m53140f() {
        return new C28440j(26);
    }

    /* renamed from: g */
    public static C28440j m53141g() {
        return new C28440j(22);
    }

    /* renamed from: h */
    public static C28440j m53142h() {
        return new C28440j(5);
    }

    /* renamed from: i */
    public static C28441k m53143i(C60200dk dkVar) {
        C62940bt btVar = C28342a.f77052b;
        C28343b bVar = (C28343b) C28344c.f77054c.createBuilder();
        bVar.copyOnWrite();
        C28344c cVar = (C28344c) bVar.instance;
        cVar.f77057b = dkVar.f162873f;
        cVar.f77056a |= 1;
        return new C28441k(btVar, (C28344c) bVar.build());
    }

    /* renamed from: j */
    public static C28441k m53144j(CompoundButton compoundButton) {
        return m53145k(!compoundButton.isChecked());
    }

    /* renamed from: k */
    public static C28441k m53145k(boolean z) {
        C62940bt btVar = C28342a.f77053c;
        C60195df dfVar = (C60195df) C60198di.f162862c.createBuilder();
        int i = true != z ? 3 : 2;
        dfVar.copyOnWrite();
        C60198di diVar = (C60198di) dfVar.instance;
        diVar.f162865b = i - 1;
        diVar.f162864a |= 1;
        return new C28441k(btVar, (C60198di) dfVar.build());
    }

    /* renamed from: l */
    public static C28442l m53146l(C60200dk dkVar) {
        C28440j g = m53141g();
        g.mo33895b(m53143i(dkVar));
        return g.mo33894a();
    }

    public final String toString() {
        String str;
        String obj = super.toString();
        C28445o oVar = this.f77225a;
        int a = C60202dm.m92544a(oVar.f77229b);
        if (a != 0) {
            switch (a) {
                case 1:
                    break;
                case 2:
                    str = "AUTOMATED";
                    break;
                case 3:
                    str = "USER";
                    break;
                case 4:
                    str = "GENERIC_CLICK";
                    break;
                case 5:
                    str = "TAP";
                    break;
                case 6:
                    str = "KEYBOARD_ENTER";
                    break;
                case 7:
                    str = "MOUSE_CLICK";
                    break;
                case 8:
                    str = "LEFT_CLICK";
                    break;
                case 9:
                    str = "RIGHT_CLICK";
                    break;
                case 10:
                    str = "HOVER";
                    break;
                case 11:
                    str = "INTO_BOUNDING_BOX";
                    break;
                case 12:
                    str = "OUT_OF_BOUNDING_BOX";
                    break;
                case 13:
                    str = "PINCH";
                    break;
                case 14:
                    str = "PINCH_OPEN";
                    break;
                case 15:
                    str = "PINCH_CLOSED";
                    break;
                case 16:
                    str = "INPUT_TEXT";
                    break;
                case 17:
                    str = "INPUT_KEYBOARD";
                    break;
                case 18:
                    str = "INPUT_VOICE";
                    break;
                case 19:
                    str = "RESIZE_BROWSER";
                    break;
                case 20:
                    str = "ROTATE_SCREEN";
                    break;
                case 21:
                    str = "DIRECTIONAL_MOVEMENT";
                    break;
                case 22:
                    str = "SWIPE";
                    break;
                case 23:
                    str = "SCROLL_BAR";
                    break;
                case 24:
                    str = "MOUSE_WHEEL";
                    break;
                case 25:
                    str = "ARROW_KEYS";
                    break;
                case 26:
                    str = "NAVIGATE";
                    break;
                case 27:
                    str = "BACK_BUTTON";
                    break;
                case 28:
                    str = "UNKNOWN_ACTION";
                    break;
                case 29:
                    str = "HEAD_MOVEMENT";
                    break;
                case 30:
                    str = "SHAKE";
                    break;
                case 31:
                    str = "DRAG";
                    break;
                case 32:
                    str = "LONG_PRESS";
                    break;
                case 33:
                    str = "KEY_PRESS";
                    break;
                case 34:
                    str = "ACTION_BY_TIMER";
                    break;
                case 35:
                    str = "DOUBLE_CLICK";
                    break;
                case 36:
                    str = "DOUBLE_TAP";
                    break;
                case 37:
                    str = "ROLL";
                    break;
                case 38:
                    str = "DROP";
                    break;
                case 39:
                    str = "FORCE_TOUCH";
                    break;
                case 40:
                    str = "MULTI_KEY_PRESS";
                    break;
                case 41:
                    str = "TWO_FINGER_DRAG";
                    break;
                case 42:
                    str = "ENTER_PROXIMITY";
                    break;
                case 46:
                    str = "CAUSAL_USER_ACTION";
                    break;
                case 47:
                    str = "CAUSAL_AUTOMATED";
                    break;
                case 48:
                    str = "INPUT_STYLUS";
                    break;
                default:
                    str = "null";
                    break;
            }
        }
        str = "UNASSIGNED_USER_ACTION_ID";
        String valueOf = String.valueOf(oVar);
        return obj + " " + str + " " + valueOf;
    }
}
